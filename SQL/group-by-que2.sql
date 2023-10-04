-- 3. Calculate the average rental duration (in days) for each film.

#Que3
select title,avg(rental_duration) as rental_avg
from film
group by title


