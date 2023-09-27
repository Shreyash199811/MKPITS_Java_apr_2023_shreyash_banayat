create database studentManagement
use studentManagement
show tables
create table studentData(studID char(4) Primary key ,studentName char(15),Addrress char(50),contact char(10))
drop table studentData
select*from studentData
insert into studentData value("101","Ankita","Nagpur",'9876655478')
insert into studentData value("102","Bhagyshree","Amravati",9990987867)
insert into studentData value("103","Maithli","Amravati",7789879066)
insert into studentData value("105","Prajakta","Badnera",8080862651)
insert into studentData value("108","Abhishek","Nanded",9098873476)
insert into studentData value('106','Shreyash','Nagpur','7216790897')
insert into studentData value('107','Pradnya','Bhadravati','7216560897')
insert into studentData value('104','Mrunali','Arjuna','9916790899')
insert into studentData value('106','Shreyash','Nagpur','7216790897')
insert into studentData value('109','Pradnya','Narkhed','8816790888')
insert into studentData value('110','Pavan','ButiBori','9327790897')
insert into studentData value('111','Avinash','Amravati','8921679089')
insert into studentData value('112','Shital','Nagpur','8286790897')
insert into studentData value('1','Shreyash','Nagpur','7216790897')


create database shopDatabase
use shopDatabase

CREATE TABLE Customers
(
CustomerID char(6) Primary Key,
FirstName char(10),
LastName char(15),
Email varchar(20),
Phone varchar(10),
Address char(100)
)

CREATE TABLE Products
(
ProductID char(10),
ProductName char(20),
ProductDescription char(200),
Price decimal(10,2),
Category char(10)
)
Alter table Products add Primary key (ProductID) 

CREATE TABLE Orders
(
OrderID char(10) Primary Key,
CustomerID char(6),
OrderDate date,
TotalAmount decimal(10,2),
constraint fk_customer foreign key (CustomerID) references  Customers(CustomerID)
)

CREATE TABLE OrderItems
(
OrderItemID char(10) Primary key,
OrderID char(10),
ProductID char(10),
Quality char(10),
Price decimal(10,2),
constraint fk_order foreign key (OrderID) references Orders(OrderID),
constraint fk_product foreign key (ProductID) references Products(ProductID)
)


















