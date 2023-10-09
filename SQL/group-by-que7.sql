-- 7. Compute the average rental rate for each film category.

#que7
select name,avg(rental_rate) 
from category join film_category
on category.category_id=film_category.category_id
join film 
on film_category.film_id=film.film_id
group by name
