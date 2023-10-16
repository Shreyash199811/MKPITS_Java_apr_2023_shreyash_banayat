DELIMITER //
CREATE FUNCTION uniqueID(fname char(15),birth_date char(8),lname char(15))
RETURNS char(16)
DETERMINISTIC 
BEGIN 
	declare reverse_lname varchar(15);
    set reverse_lname=reverse(lname);
	return concat(substr(fname,1,4),birth_date,substr(reverse_lname,1,4));
END
//
DELIMITER ;

SELECT uniqueID('shreyash','19981124','banayat');

drop function uniqueID;

