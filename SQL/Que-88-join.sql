-- 88.	Retrieve the rental date and return date for each rental made by customer "Thomas Johnson".


#Que88
select rental_date,datediff(rental_date,return_date) as Rental_duration 
from rental join customer
on rental.customer_id=customer.customer_id
where first_name="Thomas" and last_name="Johnson"