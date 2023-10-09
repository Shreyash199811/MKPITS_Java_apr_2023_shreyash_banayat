-- 8. Long rentals:
-- List films with an average rental duration of more than 7 days.

#que8
select inventory.film_id,title,avg(datediff(return_date,rental_date)) 
from rental join inventory
on rental.inventory_id=inventory.inventory_id
join film
on inventory.film_id=film.film_id
group by inventory.film_id
having avg(datediff(return_date,rental_date))>7