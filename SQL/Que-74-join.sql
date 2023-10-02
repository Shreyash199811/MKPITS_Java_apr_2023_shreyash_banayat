-- 74.	Display the film titles rented by the customer with customer_id 1900.


#que74
select title
from film join inventory
on film.film_id=inventory.film_id
join rental
on inventory.inventory_id=rental.inventory_id
where customer_id=1900
