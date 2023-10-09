-- 1. High revenue categories:
-- Find categories with an average rental revenue greater than $10.

SET GLOBAL sql_mode=(SELECT REPLACE(@@sql_mode,'ONLY_FULL_GROUP_BY',''));
#que1
select  category.category_id,category.name,avg(amount)
from category join film_category
on category.category_id=film_category.category_id
join inventory
on film_category.film_id=inventory.film_id
join rental
on inventory.inventory_id=rental.inventory_id
join payment
on rental.rental_id=payment.rental_id
group by category.category_id
having avg(amount)>10


SELECT @@sql_mode;

SET @@sql_mode = SYS.LIST_DROP(@@sql_mode, 'ONLY_FULL_GROUP_BY');
SELECT @@sql_mode;
