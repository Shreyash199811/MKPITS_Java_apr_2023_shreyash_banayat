-- 61.	List the rental date and rental duration for each rental made by customer "Paul Jackson".


#que61
select rental_date,datediff(rental_date,return_date) as Rental_duration 
from rental join customer
on rental.customer_id=customer.customer_id
where first_name="Paul" and last_name="Jackson"