-- 67.	Get the film titles and rental dates for all rentals made on October 20, 2005.


#que67
select title,rental_date
from film join inventory 
on film.film_id=inventory.film_id
join rental 
on inventory.inventory_id=rental.inventory_id
where date(rental_date)='2005-10-20'