-- Retrieve the rental date and return date for each rental made by customer "Lisa Anderson"


#Que40
select rental_date,return_date
from rental join customer
on rental.customer_id=customer.customer_id
where customer.first_name="Lisa" and last_name="Anderson"