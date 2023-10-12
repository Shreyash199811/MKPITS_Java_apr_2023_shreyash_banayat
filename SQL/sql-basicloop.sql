DELIMITER //
CREATE PROCEDURE sqlloop()
BEGIN 
	declare number int;
    set number=0;
   loop1: loop 
    select number;
    set number=number+1;
    IF number>=11 THEN 
    leave loop1;
    end if;
    end loop;
END
//
DELIMITER ;

CALL sqlloop();

drop procedure sqlloop;
    
	 