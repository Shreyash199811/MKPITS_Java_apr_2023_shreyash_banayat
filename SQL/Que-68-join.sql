-- 68.	Retrieve the film titles rented by the customer with customer_id 1700.


#que68
select title
from film join inventory
on film.film_id=inventory.film_id
join rental
on inventory.inventory_id=rental.inventory_id
where customer_id=1700
