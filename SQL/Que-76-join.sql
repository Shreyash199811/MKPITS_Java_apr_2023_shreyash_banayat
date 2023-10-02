-- 76.	Retrieve the rental date and return date for each rental made by customer "George Davis".


#que76
select rental_date,return_date
from rental join customer
on rental.customer_id=customer.customer_id
where first_name="George" and last_name="Davis"
