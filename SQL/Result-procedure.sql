DELIMITER //
CREATE PROCEDURE result(marks int)
BEGIN 
	if marks<=50 then
    select "Fail";
    else 
	if marks>50 and marks<=60 then
	select "Pass";
	
		elseif marks>60 then 
		select "Distintion";
		end if;
    end if;
END  
//
DELIMITER ;

call result(50);
        