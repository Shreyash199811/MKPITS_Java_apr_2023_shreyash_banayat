-- 10. Calculate the count of rentals for each film language.

#que10
select name,count(rental_id)
from language join film
on language.language_id=film.language_id
join inventory
on film.film_id=inventory.film_id
join rental
on inventory.inventory_id=rental.inventory_id
group by name
