-- 1. Find customers who rented a specific film:
-- Retrieve the names of customers who rented the film with the title 'Inception'.

#que1
select first_name,last_name from 
customer join rental on
customer.customer_id=rental.rental_id join
inventory on
rental.inventory_id=inventory.inventory_id join 
film on 
inventory.film_id=film.film_id
where title= (select title from film where title='Inception');
