-- 8. Determine the count of rentals for each film.

#que8
select film.film_id,title,count(rental_id) as rental_count
from film join inventory
on film.film_id=inventory.film_id
join rental
on inventory.inventory_id=rental.inventory_id
group by film.film_id



select title,count(rental_id) as rental_count
from film join inventory
on film.film_id=inventory.film_id
join rental
on inventory.inventory_id=rental.inventory_id
group by title

