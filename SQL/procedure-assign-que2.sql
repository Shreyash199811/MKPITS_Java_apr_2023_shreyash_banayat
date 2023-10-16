-- Problem Statement 2: 
-- Generate a Rental Receipt
-- Create a stored procedure that generates a rental receipt for a given rental ID.
-- The receipt should include rental details, customer information, and total cost. 
-- The procedure should output the receipt to the console.

#Que2
DELIMITER //
CREATE PROCEDURE rental_receipt(rent_id int)
BEGIN
	select customer.customer_id,first_name,last_name,rental.rental_id,rental_date,amount
    from customer  join rental 
    on customer.customer_id=rental.customer_id 
    join payment
    on rental.rental_id=payment.rental_id
    where rental.rental_id=rent_id and payment.rental_id=rent_id;
END
//
DELIMITER ;

call rental_receipt(50);

drop procedure rental_receipt;
