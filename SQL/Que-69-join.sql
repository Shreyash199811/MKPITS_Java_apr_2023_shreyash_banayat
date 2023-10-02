-- 69.	List the rental date and return date for all rentals made by customer "Donald Davis".


#que69
select rental_date,return_date
from rental join customer
on rental.customer_id=customer.customer_id
where first_name="Donald" and last_name="Davis"