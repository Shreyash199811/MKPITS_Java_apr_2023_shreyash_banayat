-- 2. Customers with many rentals:
-- Identify customers who have rented more than 30 films.

#que2
select customer.customer_id,count(film.film_id)
from customer join rental
on customer.customer_id=rental.customer_id
join inventory
on rental.inventory_id=inventory.inventory_id
join film
on inventory.film_id=film.film_id
group by customer_id
having count(film.film_id)>30