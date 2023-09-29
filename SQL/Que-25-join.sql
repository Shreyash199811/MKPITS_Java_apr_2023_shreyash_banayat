-- List the rental date and return date for all rentals made by customer "Susan Johnson"


#Que25
select rental_date,return_date 
from customer join rental
on customer.customer_id=rental.customer_id
where first_name='Susan' and last_name='Johnson'
