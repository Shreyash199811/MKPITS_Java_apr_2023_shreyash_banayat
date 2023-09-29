-- Display the film titles rented by the customer with customer_id 700


#Que26
select title
from film join inventory 
on film.film_id=inventory.film_id
join rental 
on inventory.inventory_id=rental.inventory_id 
join customer
on rental.customer_id=customer.customer_id
where customer.customer_id=700