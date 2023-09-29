-- Retrieve the film titles rented by the customer with customer_id 100.

#Que5
SELECT title 
FROM film 
JOIN inventory
ON film.film_id=inventory.film_id
JOIN rental
ON inventory.inventory_id=rental.rental_id
JOIN customer
ON rental.rental_id=customer.customer_id
where customer.customer_id=100
	