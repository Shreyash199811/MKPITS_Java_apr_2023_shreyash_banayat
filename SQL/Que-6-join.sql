-- List the film titles and rental dates for all rentals made by the customer with customer_id 200

#Que6
SELECT customer.customer_id,title,rental_date
FROM film 
JOIN inventory
ON film.film_id=inventory.film_id
JOIN rental
ON inventory.inventory_id=rental.inventory_id
JOIN customer
ON rental.customer_id=customer.customer_id
WHERE customer.customer_id=200