-- 95.	Get the first name, last name, and email of customers who have rented more than 22 films.


#Que95
select first_name,last_name,email
from customer join rental
on customer.customer_id=rental.customer_id
group by rental.customer_id
having count(rental_id)>22