-- 98.	Display the film titles rented by the customer with customer_id 2500.


#que98
SELECT title
FROM film 
JOIN inventory
ON film.film_id=inventory.film_id
JOIN rental
ON inventory.inventory_id=rental.inventory_id
WHERE customer_id=2500
