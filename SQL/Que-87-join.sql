-- 87.	Get the names of customers who have rented the film titled "Gang Related".


#Que87
select first_name,last_name
from film join inventory
on film.film_id=inventory.film_id
join rental 
on inventory.inventory_id=rental.inventory_id
join customer
on rental.customer_id=customer.customer_id
where title="Gang Related"