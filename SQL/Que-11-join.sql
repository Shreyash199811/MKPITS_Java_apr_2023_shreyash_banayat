-- List the film titles and rental dates for all rentals made by customer "Mary Johnson".

#Que11
select title,rental_date
from film join inventory 
on film.film_id=inventory.film_id
join rental 
on inventory.inventory_id=rental.inventory_id 
join customer
on rental.customer_id=customer.customer_id
where first_name='Mary' and last_name='Johnson'