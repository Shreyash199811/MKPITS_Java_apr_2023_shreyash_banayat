-- 64.	Retrieve the rental date and return date for each rental made by customer "Mary Harris".


#que64
select rental_date,return_date
from rental join customer
on rental.customer_id=customer.customer_id
where first_name='Mary' and last_name='Harris'