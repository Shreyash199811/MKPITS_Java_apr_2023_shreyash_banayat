DELIMITER //
CREATE PROCEDURE print_Hello(num int)
BEGIN
declare iterator int;
set iterator=0;
REPEAT
	select "hello";
    set iterator=iterator+1;
    UNTIL iterator>=num		-- untill false
    END REPEAT;
END
//
DELIMITER  

CALL print_Hello(10);

drop procedure print_Hello;