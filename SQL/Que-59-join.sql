-- 59.	Get the first name, last name, and email of customers who have rented more than 15 films.


#que59
select first_name,last_name,email
from customer join rental
on customer.customer_id=rental.customer_id
group by rental.customer_id
having count(rental_id)>15



select rental.customer_id,first_name,last_name,email
from rental join customer
on rental.customer_id=customer.customer_id
group by customer_id
having count(rental_id)>15