-- 89.	List the film titles and rental dates for all rentals made by customer "Sarah Harris".


#Que89
SELECT title,rental_date
FROM film 
JOIN inventory
ON film.film_id=inventory.film_id
JOIN rental
ON inventory.inventory_id=rental.inventory_id
join customer
on rental.customer_id=customer.customer_id
WHERE first_name="Sarah" and last_name="Harris"