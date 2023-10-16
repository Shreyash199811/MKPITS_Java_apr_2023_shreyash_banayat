DELIMITER //
CREATE FUNCTION order_price(order_quantity int,unit_price decimal(10,2))
RETURNS decimal(20,2)
DETERMINISTIC
BEGIN
	RETURN order_quantity*unit_price;
END
//
DELIMITER ;

select order_price(20,10.00)  as total_value;
