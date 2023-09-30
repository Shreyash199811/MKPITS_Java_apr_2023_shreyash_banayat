-- Get the first name, last name, and email of customers who have rented more than 12 films.


#Que47
select  customer.customer_id,first_name,last_name,count(rental_id)
from customer join rental
on customer.customer_id=rental.customer_id
group by customer_id
having count(rental_id)>12