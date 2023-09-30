-- Display the film titles rented by the customer with customer_id 1300


#Que50
select title,rental_date
from film join inventory 
on film.film_id=inventory.film_id
join rental 
on inventory.inventory_id=rental.inventory_id 
join customer
on rental.customer_id=customer.customer_id
where customer.customer_id=1300