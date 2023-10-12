CREATE DEFINER=`root`@`localhost` PROCEDURE `factorial`(userip int)
BEGIN
	declare number int;
    declare fact int;
    set number=1;
    set fact=1;
	WHILE number<=userip
    DO
    select fact;
    set number=number+1;
    set fact=fact*number;
    END WHILE;
END