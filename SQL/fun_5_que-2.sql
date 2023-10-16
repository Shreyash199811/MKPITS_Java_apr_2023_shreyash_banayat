DELIMITER //
CREATE FUNCTION f_age(birth_date date)
RETURNS int
DETERMINISTIC
BEGIN
	RETURN datediff(curdate(),birth_date)/365;
END
//
DELIMITER ; 

select f_age('1998-11-16');

drop function f_age;

use stud_man;