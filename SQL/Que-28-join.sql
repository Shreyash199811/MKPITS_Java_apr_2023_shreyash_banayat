-- Retrieve the rental date and rental duration for each rental made by customer "Joseph Brown"


#Que28
select First_name,Last_name,rental_date,datediff(return_date,rental_date) rental_duration
from customer join rental
on customer.customer_id=rental.customer_id
where first_name='Joseph' and last_name='Brown'