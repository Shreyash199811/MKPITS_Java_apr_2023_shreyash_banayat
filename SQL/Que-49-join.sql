-- List the rental date and rental duration for each rental made by customer "David Clark"


#Que49
select rental_date,datediff(return_date,rental_date) rental_duration
from rental join customer
on rental.customer_id=customer.customer_id
where first_name="David" and last_name="Clark"