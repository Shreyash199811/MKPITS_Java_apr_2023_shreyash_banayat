-- 54.	Display the first name, last name, and email of customers 
-- who have rented the film titled "Spice Sorcerer".


#que54
select first_name,last_name,email,title
from film join inventory
on film.film_id=inventory.film_id
join rental 
on inventory.inventory_id=rental.inventory_id
join customer
on rental.customer_id=customer.customer_id
where title='Spice Sorcerer'