-- 57.	List the rental date and return date for all rentals made by customer "Sarah Thomas".


#que57
select rental_date,return_date
from rental join customer
on rental.customer_id=customer.customer_id
where first_name='Sarah' and last_name='Thomas'