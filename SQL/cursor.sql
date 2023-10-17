use stud_man;

create table stud_address(stud_name char(20),stud_address char(20));
select * from studentdetails

DELIMITER //
CREATE PROCEDURE p_cursor()
begin
	declare n,c varchar(20);
    declare done int;
    declare mycursor cursor for select name,address from studentdetails;
    declare continue handler for not found set done=1;
    open mycursor;
    
    
    label:loop 
    fetch mycursor into n,c;
    insert into stud_address values(n,c);
    if done=1 then
    leave label;
    end if;
    end loop;
    close mycursor;
end
//
DELIMITER ;


call p_cursor;
select * from stud_address;

	
    
    
    