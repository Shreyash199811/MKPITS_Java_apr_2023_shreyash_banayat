-- Get the film titles and rental dates for all rentals made on August 10, 2005

select rental_date  from rental

#Que18
select title,rental_date
from film join inventory 
on film.film_id=inventory.film_id
join rental 
on inventory.inventory_id=rental.inventory_id
where date(rental_date)='2005-08-10'