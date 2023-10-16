DELIMITER //
CREATE FUNCTION f_reverse(anyString varChar(20))
returns varchar(20)
deterministic
BEGIN 
	return reverse(anyString);
END
//
DELIMITER ;

select f_reverse("laptop")
    
	