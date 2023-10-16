DELIMITER //
CREATE FUNCTION calGST(amt decimal(5,2))
RETURNS decimal(5,2) 
DETERMINISTIC
BEGIN
 declare gst int;
 set gst=amt*0.8;
return gst;
END//
DELIMITER ;			-- function end

select calGST(45.45);

select payment_id,amount,calGST(amount) as GST,amount+calGSt(amount) as Total from payment;
