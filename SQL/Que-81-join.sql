-- 81.	List the rental date and return date for all rentals made by customer "Kevin Johnson".


#que81
select rental_date,return_date
from rental join customer
on rental.customer_id=customer.customer_id
where first_name="Kevin" and last_name="Johnson"