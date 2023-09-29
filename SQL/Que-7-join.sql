-- Display the film titles and rental durations for all rentals made on May 15, 2005
select * from rental
#Que7
select title,datediff(return_date,rental_date) rental_Duration
from film join inventory 
on film.film_id=inventory.film_id
join rental 
on inventory.inventory_id=rental.inventory_id
where date(rental_date)='2005-05-15'