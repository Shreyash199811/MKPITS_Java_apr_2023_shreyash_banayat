-- List the rental date and rental duration for each rental made by customer "Charles Harris".


#Que37
select First_name,Last_name,rental_date,datediff(return_date,rental_date) rental_duration
from customer join rental
on customer.customer_id=rental.customer_id
where first_name='Charles' and last_name='Harris'
