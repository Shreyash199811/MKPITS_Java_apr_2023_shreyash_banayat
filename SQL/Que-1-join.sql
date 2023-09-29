1.Retrieve the names of all customers and the titles of the films they have rented.

#Que 1
select first_name,last_name,title 
from film join inventory 
on film.film_id=inventory.film_id
join rental 
on inventory.inventory_id=rental.inventory_id 
join customer
on rental.customer_id=customer.customer_id