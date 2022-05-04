USE master
GO
CREATE DATABASE FoodZone
GO
USE FoodZone
GO

CREATE TABLE [Users] (
	Username varchar(20) PRIMARY KEY,
	[Password] varchar(16) NOT NULL CHECK(LEN([Password]) >= 8 AND LEN([Password]) <= 64),
	Fullname varchar(40),
	ID varchar(12),
	[Address] varchar(70),
	Phone varchar(10) CHECK(LEN(Phone) = 10),
	[Image] varchar(200)
)
GO

CREATE TABLE Cart (
	Username varchar(20) PRIMARY KEY,
	TotalPrice money
)
GO

CREATE TABLE CartDetails (
	Username varchar(20),
	MealID varchar(10),
	MealQuantity integer CHECK (MealQuantity > 0),
	PRIMARY KEY(Username, MealID)
)
GO

CREATE TABLE Meal (
	MealID varchar(10) PRIMARY KEY,
	[Name] varchar(30) NOT NULL,
	[Description] varchar(150),
	Price money CHECK (Price > 0),
	[Image] varchar(200),
	RestaurantID varchar(10)
)
GO

CREATE TABLE Restaurant (
	RestaurantID varchar(10) PRIMARY KEY,
	[Name] varchar(30) NOT NULL,
	[Address] varchar(70),
	[Image] varchar(200)
)
GO

CREATE TABLE OrderDetails (
	OrderID varchar(20),
	MealID varchar(10),
	MealQuantity integer CHECK (MealQuantity > 0)
	PRIMARY KEY(OrderID, MealID)
)
GO

CREATE TABLE [Order] (
	OrderID varchar(20) PRIMARY KEY,
	OrderDateTime varchar(30),
	[State] varchar(9) NOT NULL,
	TimeRemaining time,
	ArriveDateTime datetime,
	CancelDateTime datetime
)
GO

CREATE TABLE Recipient (
	OrderID varchar(20) PRIMARY KEY,
	Fullname varchar(40),
	ID varchar(12),
	[Address] varchar(70) NOT NULL,
	Phone varchar(10),
	[Email] varchar(30)
)
GO

ALTER TABLE Cart
ADD CONSTRAINT fk_Cart_User FOREIGN KEY (Username) REFERENCES [Users](Username)
GO

ALTER TABLE CartDetails
ADD CONSTRAINT fk_CartDetails_Cart FOREIGN KEY (Username) REFERENCES Cart(Username)
GO

ALTER TABLE CartDetails
ADD CONSTRAINT fk_CartDetails_Meal FOREIGN KEY (MealID) REFERENCES Meal(MealID)
GO

ALTER TABLE OrderDetails
ADD CONSTRAINT fk_OrderDetails_Meal FOREIGN KEY (MealID) REFERENCES Meal(MealID)
GO

ALTER TABLE OrderDetails
ADD CONSTRAINT fk_OrderDetails_Order FOREIGN KEY (OrderID) REFERENCES [Order](OrderID)
GO

ALTER TABLE Meal
ADD CONSTRAINT fk_Meal_Restaurant FOREIGN KEY (RestaurantID) REFERENCES Restaurant(RestaurantID)
GO

ALTER TABLE Recipient
ADD CONSTRAINT fk_Recipient_Order FOREIGN KEY (OrderID) REFERENCES [Order](OrderID)
GO

INSERT INTO [Users]
(Username,[Password]  ,Fullname			     ,ID		  ,[Address]		 ,Phone		  ,[Image]) VALUES
('admin' ,'adminadmin','Admin'				 ,'0000000000',null				 ,null		  ,null),
('kiet'	 ,'12345678'  ,'Ngo Van Anh Kiet'    ,'0011223344','027C Chung cu An Quang', '0901210304', 'kiet_tgww6q.jpg'),
('phat'	 ,'12345678'  ,'Trieu Nguyen Phat'   ,'0011223345','12 Tran Hung Dao','0589199209',null),
('khue'	 ,'12345678'  ,'Pham Trong Vinh Khue','0011223346','13 Tran Hung Dao',null		  ,null)
GO

INSERT INTO Cart(Username) VALUES
('admin'),
('kiet'),
('phat'),
('khue')
GO

INSERT INTO Restaurant(RestaurantID, [Name], [Address], [Image]) VALUES
('001','Pickles'	,'1 Nguyen Dinh Chieu', 'tcf1_bky9av.jpg'),
('002','Qua Mon'	,'3 Nguyen Ngoc Thach', 'tcf2_ufnsvs.jpg'),
('003','Rem'		,'8 Nguyen Thi Minh Khai', 'tcf3_mu7rty.jpg'),
('004','Qua Mon 2'	,'3 30/4', 'tcf4_dvbttz.jpg'),
('005','MonkaS'		,'7 Tran Nhan Tong', 'tcf5_qyjqsc.jpg')
GO

INSERT INTO Meal
(MealID, [Name], [Description], Price, [Image], RestaurantID) VALUES
('f01' ,'Capuchino','With beautiful creamy milk drawings',300000,'f01_yqu0po.jpg','001'),
('f02' ,'Smoothed Coffee & Milk','50% Milk and 50% Coffee',12345,'f02_yfgwkp.jpg','001'),
('f03' ,'Expresso','Traditional black coffee with nice aroma',500000,'f03_quesov.jpg','002'),
('f04' ,'Sour Cream Coffee','Milked coffee with a heap of ice cream',60000,'f04_bdeajz.jpg','002'),
('f05' ,'Ca phe sua da','The famous Vietnamese coffee. Makes you feel nostalgic!',200000,'f05_lrjbzt.jpg','003'),
('f06' ,'Cheese Sandwich','A nice sandwich for breakfast',40000,'f06_vj6iyk.jpg','003'),
('f07' ,'Pork Floss Sponge Cake','Soft and savoury.',152500,'f07_ibqdy9.webp','004'),
('f08' ,'Lemonade Soft Cake','Sweet and sour. A great appetizer.',69000,'f08_xwdrby.webp','005'),
('f09' ,'Pate Stick Bread','4 sticks of bread filled to the brim with pate.',420000,'f09_v5nyhd.webp','005')
GO

select t1.OrderID, OrderDateTime, [Desc], [State], RecipientName, Price, Restaurant from 
(select OrderID, o.OrderDateTime, o.[State] from [Order] as o 
WHERE o.OrderID LIKE 'phat%') t1 
inner join
(select OrderID, STRING_AGG(CONCAT(Meal.[Name], ' x', MealQuantity), '---') as [Desc]
from OrderDetails, Meal
where OrderDetails.MealID = Meal.MealID
and OrderID like 'phat%'
group by OrderID) t2 on t1.OrderID = t2.OrderId 
inner join 
(select OrderID, Fullname as recipientName
from Recipient
where OrderID like 'phat%') t3 on t2.OrderID =  t3.OrderID
inner join 
(select OrderID, sum(OrderDetails.MealQuantity*Meal.Price) as price from OrderDetails, meal
where OrderDetails.MealID = meal.MealID 
group by OrderID) t4 
on t3.OrderID = t4.OrderID
inner join 
(select distinct OrderID, Restaurant.[Name] as Restaurant from OrderDetails, Meal, Restaurant 
where OrderDetails.MealID = Meal.MealID
and Meal.RestaurantID = Restaurant.RestaurantID) t5 
on t4.OrderID = t5.OrderID