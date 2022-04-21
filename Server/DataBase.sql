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
	MealID nvarchar(10),
	OrderID nvarchar(10),
	MealQuantity integer CHECK (MealQuantity > 0)
	PRIMARY KEY(MealID, OrderID)
)
GO

CREATE TABLE [Order] (
	OrderID nvarchar(10) PRIMARY KEY,
	OrderDateTime datetime,
	RecipientID  nvarchar(12),
	[State] nvarchar(9) NOT NULL,
	TimeRemaining time,
	ArriveDateTime datetime,
	CancelDateTime datetime
)
GO

CREATE TABLE Recipient (
	Fullname nvarchar(40),
	ID nvarchar(12) PRIMARY KEY,
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

ALTER TABLE [Order]
ADD CONSTRAINT fk_Order_RecipientID FOREIGN KEY (RecipientID) REFERENCES Recipient(ID)
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
('002','Qua M�n'	,'3 Nguyen Ngoc Thach'),
('003','Rem'		,'8 Nguyen Thi Minh Khai'),
('004','Qua M�n 2'	,'3 30/4'),
('005','MonkaS'		,'7 Tran Nhan Tong')
GO

INSERT INTO Meal
(MealID, [Name], [Description], Price, [Image], RestaurantID) VALUES
('f01' ,'M�n 1','c� 3 c?c ph� mai',300000,null,'001'),
('f02' ,'M�n 2','khi?n b?n nh? nh�',12345,null,'001'),
('f03' ,'M�n 3','hmm',500000,null,'002'),
('f04' ,'M�n 4','?n ?i r?i bi?t',60000,null,'002'),
('f05' ,'M�n 5','L?u ?n c�ng nhi?u ng??i, gi� c�ng m?c!',200000,null,'003'),
('f06' ,'M�n 6','C�ng ?n c�ng bu?n',40000,null,'003'),
('f07' ,'M�n 7','Tr� s?a v? c� chua, th? ngay h�m qua!',152500,null,'004'),
('f08' ,'M�n 8','69 ngh�n c� ngay n??c l?u buffet cho 1 ng??i ?n! (Ch?a bao g?m th?t v� rau)',69000,null,'005'),
('f09' ,'M�n 9','Th?t v� rau',420000,null,'005')
GO