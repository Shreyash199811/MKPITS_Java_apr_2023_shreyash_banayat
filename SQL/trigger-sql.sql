create database Products_man;
use Products_man;
create table products(productId int primary key,product_name varchar(20),price decimal(10,2),quantity int);
drop table products;

insert into products value(1001,'Monitor',20000.00,50);
insert into products value(1002,'ROG-keyboard',17000.00,50);
insert into products value(1003,'zebronic-mouse',1000.00,50);
insert into products value(1004,'SSD',5000.00,50);

create table sales(salesId int,productId int,quantity int);
insert into sales value(1,1001,5);


DELIMITER //
CREATE TRIGGER afte_sales_trigger 
AFTER INSERT ON sales FOR EACH ROW
BEGIN
	UPDATE products
    set quantity=quantity-NEW.quantity
    where productId=NEW.productId;
END;
// 
DELIMITER ;

insert into sales value(2,1001,5);
select * from sales;
select * from products

create table stock_purchase(productId int ,quantity int);


DELIMITER //
CREATE TRIGGER update_products_trigger 
AFTER INSERT ON stock_purchase FOR EACH ROW
BEGIN 
	update products
    set quantity=quantity+NEW.quantity
    where productId=NEW.productId;
END;
//
DELIMITER ;

insert into stock_purchase value(1002,10);
insert into stock_purchase value(1003,5);
insert into stock_purchase value(1004,8);



    
