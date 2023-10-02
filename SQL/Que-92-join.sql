-- 92.	Retrieve the film titles rented by the customer with customer_id 2300.


#que92
SELECT title
FROM film 
JOIN inventory
ON film.film_id=inventory.film_id
JOIN rental
ON inventory.inventory_id=rental.inventory_id
WHERE customer_id=2300