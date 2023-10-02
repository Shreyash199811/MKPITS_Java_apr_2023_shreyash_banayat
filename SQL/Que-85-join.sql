-- 85.	List the rental date and rental duration for each rental made by customer "Nancy Davis".


#Que85
select rental_date,datediff(rental_date,return_date) as Rental_duration 
from rental join customer
on rental.customer_id=customer.customer_id
where first_name="Nancy" and last_name="Davis"