-- List the film titles and rental dates for all rentals made by customer "Matthew Smith"


#Que41
select title ,rental_date
from film join inventory 
on film.film_id=inventory.film_id
join rental 
on inventory.inventory_id=rental.inventory_id 
join customer
on rental.customer_id=customer.customer_id
where first_name="Matthew" and last_name="Smith"