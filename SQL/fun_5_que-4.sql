DELIMITER //
CREATE FUNCTION calBMI(weight decimal(5,2),height decimal(5,2))
RETURNS decimal(5,2)
DETERMINISTIC
BEGIN 
	return weight/height ;
END
//
DELIMITER ;


select calBMI(91.50,1.79);

drop function calBMI;