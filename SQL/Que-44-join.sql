-- Retrieve the film titles rented by the customer with customer_id 1100


#Que44
select title,rental_date
from film join inventory 
on film.film_id=inventory.film_id
join rental 
on inventory.inventory_id=rental.inventory_id 
join customer
on rental.customer_id=customer.customer_id
where customer.customer_id=1000