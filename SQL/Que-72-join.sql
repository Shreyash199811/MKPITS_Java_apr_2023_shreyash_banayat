-- 72.	Retrieve the film titles and rental dates for all rentals
-- made by the customer with customer_id 1800.


#que72
SELECT title
FROM film 
JOIN inventory
ON film.film_id=inventory.film_id
JOIN rental
ON inventory.inventory_id=rental.inventory_id
WHERE customer_id=1800