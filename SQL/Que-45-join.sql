-- List the rental date and return date for all rentals made by customer "Jennifer Lee"


#Que45
select rental_date,return_date 
from rental join customer
on rental.customer_id=customer.customer_id
where first_name="Jennifer" and last_name="Lee"
