USE master
GO
CREATE DATABASE FoodZone
GO
USE FoodZone
GO

CREATE TABLE [Users] (
	Username nvarchar(20) PRIMARY KEY,
	[Password] nvarchar(16) NOT NULL CHECK(LEN([Password]) >= 8 AND LEN([Password]) <= 64),
	Fullname nvarchar(40),
	ID nvarchar(12),
	[Address] nvarchar(70),
	Phone nvarchar(10) CHECK(LEN(Phone) = 10),
	[Image] nvarchar(200)
)
GO

CREATE TABLE Cart (
	Username nvarchar(20) PRIMARY KEY,
	TotalPrice money
)
GO

CREATE TABLE CartDetails (
	Username nvarchar(20),
	MealID nvarchar(10),
	MealQuantity integer CHECK (MealQuantity > 0),
	PRIMARY KEY(Username, MealID)
)
GO

CREATE TABLE Meal (
	MealID nvarchar(10) PRIMARY KEY,
	[Name] nvarchar(30) NOT NULL,
	[Description] nvarchar(150),
	Price money CHECK (Price > 0),
	[Image] nvarchar(10),
	RestaurantID nvarchar(10)
)
GO

CREATE TABLE Restaurant (
	RestaurantID nvarchar(10) PRIMARY KEY,
	[Name] nvarchar(30) NOT NULL,
	[Address] nvarchar(70)
)
GO

CREATE TABLE OrderDetails (
	OrderID nvarchar(20),
	MealID nvarchar(10),
	MealQuantity integer CHECK (MealQuantity > 0)
	PRIMARY KEY(OrderID, MealID)
)
GO

CREATE TABLE [Order] (
	OrderID nvarchar(20) PRIMARY KEY,
	OrderDateTime datetime,
	[State] nvarchar(9) NOT NULL,
	TimeRemaining time,
	ArriveDateTime datetime,
	CancelDateTime datetime
)
GO

CREATE TABLE Recipient (
	OrderID nvarchar(20) PRIMARY KEY,
	Fullname nvarchar(40),
	ID nvarchar(12),
	[Address] nvarchar(70) NOT NULL,
	Phone nvarchar(10),
	[Email] nvarchar(30)
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
('kiet'	 ,'12345678'  ,'Ngo Van Anh Kiet'    ,'0011223344','027C Chung cu An Quang', '0901210304', 'kiet.jpg'),
('phat'	 ,'12345678'  ,'Trieu Nguyen Phat'   ,'0011223345','12 Tran Hung Dao','0589199209',null),
('khue'	 ,'12345678'  ,'Pham Trong Vinh Khue','0011223346','13 Tran Hung Dao',null		  ,null)
GO

INSERT INTO Cart(Username) VALUES
('admin'),
('kiet'),
('phat'),
('khue')
GO

INSERT INTO Restaurant(RestaurantID, [Name], [Address]) VALUES
('001','Pickles'	,'1 Nguyen Dinh Chieu'),
('002','Qua Mon'	,'3 Nguyen Ngoc Thach'),
('003','Rem'		,'8 Nguyen Thi Minh Khai'),
('004','Qua Mon 2'	,'3 30/4'),
('005','MonkaS'		,'7 Tran Nhan Tong')
GO

INSERT INTO Meal
(MealID, [Name], [Description], Price, [Image], RestaurantID) VALUES
('f01' ,'Mon 1','co 3 cuc pho mai',300000,null,'001'),
('f02' ,'Mon 2','khien ban nho nha',12345,null,'001'),
('f03' ,'Mon 3','hmm',500000,null,'002'),
('f04' ,'Mon 4','an di roi biet',60000,null,'002'),
('f05' ,'Mon 5','Lau an cang nhieu nguoi, gia cang mac!',200000,null,'003'),
('f06' ,'Mon 6','Cang an cang buon',40000,null,'003'),
('f07' ,'Mon 7','Tra sua vi ca chua, thu ngay hom qua!',152500,null,'004'),
('f08' ,'Mon 8','69 nghin co ngay nuoc lau buffet cho 1 nguoi an! (Chua bao gom thit va rau)',69000,null,'005'),
('f09' ,'Mon 9','Thit va rau',420000,null,'005')
GO