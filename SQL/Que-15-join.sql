-- Retrieve the rental date and return date for each rental made by customer "Richard Davis"

#Que15
select rental_date,return_date
from rental join customer
on rental.customer_id=customer.customer_id
where first_name='Richard' and last_name='Davis'