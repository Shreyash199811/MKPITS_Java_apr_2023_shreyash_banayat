CREATE DEFINER=`root`@`localhost` PROCEDURE `selectProcedure`(input int)
BEGIN
	if input=1 then 
    select * from actor;
    elseif input=2 then
    select * from address;
    elseif input=3 then
    select * from category;
    elseif input=4 then
    select * from city;
    end if;
END

