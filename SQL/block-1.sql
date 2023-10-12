-- Procedure block

DELIMITER //
CREATE PROCEDURE sp_GetMovies()
BEGIN
select film_id,title from film;
END
//
DELIMITER ;  

CALL sp_GetMovies()


DELIMITER //
CREATE PROCEDURE sp_GetCustomerDetails()
BEGIN
select customer_id,first_name,last_name,email from customer;
END
//
DELIMITER ;  

call sp_GetCustomerDetails()
