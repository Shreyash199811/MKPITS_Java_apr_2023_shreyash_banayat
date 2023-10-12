DELIMITER //
CREATE PROCEDURE factUsingLoop(num int)
BEGIN 
	declare iterator int;
    declare fact int;
    set iterator=1;
    set fact=1;
    loop1:loop
    set fact=fact*iterator;
    set iterator=iterator+1;
    if iterator>num then
    leave loop1;
    end if;
    end loop;
    select fact;
END
//
DELIMITER ;

CALL factUsingLoop(10);