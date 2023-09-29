-- Get the titles of all films rented by the customer named "William Brown".

#Que4
select title
from film
join inventory
on film.film_id=inventory.film_id
join rental 
on inventory.inventory_id=rental.inventory_id
join customer
on rental.customer_id=customer.customer_id
where first_name='William' and last_name='Brown'
