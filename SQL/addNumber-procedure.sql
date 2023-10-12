DELIMITER //
CREATE  PROCEDURE addNumber(num1 int,num2 int2)
BEGIN
	declare sum int;
    set sum=num1+num2;
    select sum;
END
//
DELIMITER ;  

CALL addNumber(6,7)