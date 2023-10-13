create table rollNumbers(RollNo int);

DELIMITER //
CREATE PROCEDURE add_rollno() 
BEGIN
	declare iterator int;
	set iterator=1;
    while iterator <=100 do
-- 		select * from  rollNumbers;
		insert into rollNumbers values(iterator);
		set iterator=iterator+1;
	end while;
end
//
DELIMITER ;

call add_rollno();
select * from rollNumbers;

drop procedure add_rollno;

delete from rollNumbers; 
