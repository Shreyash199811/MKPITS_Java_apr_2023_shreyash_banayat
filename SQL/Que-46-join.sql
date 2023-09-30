-- Display the names of customers who have rented the film titled "Inferno Kilometer"


#Que46
select first_name
from film join inventory 
on film.film_id=inventory.film_id
join rental 
on inventory.inventory_id=rental.inventory_id 
join customer
on rental.customer_id=customer.customer_id
where film.title="Inferno Kilomete"