-- 60.	Retrieve the film titles and rental dates for all rentals made by the customer
--  with customer_id 1500.


#que60
SELECT title,rental_date
FROM film 
JOIN inventory
ON film.film_id=inventory.film_id
JOIN rental
ON inventory.inventory_id=rental.inventory_id
WHERE customer_id=1400