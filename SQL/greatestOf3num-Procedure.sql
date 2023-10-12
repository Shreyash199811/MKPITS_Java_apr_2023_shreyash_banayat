DELIMITER //
CREATE PROCEDURE greatestOfAllThree(num1 int,num2 int,num3 int)
BEGIN 
	declare g int;
	if num1>=num2 AND num1>=num3 then
    set g=num1;
    select num1"is greatest",g;
	elseif num2>=num1 AND num2>=num1 then
    set g=num2;
    select "is greatest",g;
    else
    set g=num3;
	select "is greatest",g;
    end if;
END
//
DELIMITER 

DROP PROCEDURE greatestOfAllThree;

CALL greatestOfAllThree(12,20,10);