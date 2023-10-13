DELIMITER //
CREATE PROCEDURE sp_getTotalAmountOfCustomer(IN cust_id int,OUT tot_amt int)
begin 
select sum(amount) into  tot_amt from payment where customer_id=cust_id;
end
//
DELIMITER  ;

call sp_getTotalAmountOfCustomer(2,@ta)
select @ta

drop procedure sp_getTotalAmountOfCustomer;