DELIMITER //
CREATE PROCEDURE evenOrOdd(num int)
BEGIN 
	declare number int;
    set number=num;
    if number%2=0 then
    select "even",number;
    else
    select "odd",number;
    end if;
END
//
DELIMITER 

CALL evenOrOdd(4);

drop procedure evenOrOdd;