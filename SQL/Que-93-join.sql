-- 93.	List the rental date and return date for all rentals made by customer "Laura Taylor".


#que93
select rental_date,datediff(rental_date,return_date) as Rental_duration 
from rental join customer
on rental.customer_id=customer.customer_id
where first_name="Laura" and last_name="Taylor"
