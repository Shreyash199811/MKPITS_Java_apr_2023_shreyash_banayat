CREATE DEFINER=`root`@`localhost` PROCEDURE `WhileLoop`()
BEGIN	
	declare num int;
    set num=1;
    WHILE num<11 DO
		select num;
		set num =num+1;
        
	END WHILE;
END