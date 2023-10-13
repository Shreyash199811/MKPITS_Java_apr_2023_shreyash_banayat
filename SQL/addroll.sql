DELIMITER //
CREATE PROCEDURE addrollno( num int) 
BEGIN
	declare iterator int;
    declare rn int;
    select max(rollno) into rn from rollNumbers;
	set iterator=0;
    while iterator <num do
		set rn=rn+1;
		insert into rollNumbers values(rn);
		set iterator=iterator+1;
	end while;
end
//
DELIMITER ;


call addrollno(5);
select * from rollNumbers;

drop procedure addrollno;