-- List the names of actors who have appeared in the film titled "Chamber Italian" 

#Que3 

select first_name,last_name,title 
from actor join film_actor
on actor.actor_id=film_actor.actor_id 
join film 
on film_actor.film_id=film.film_id
where title='Chamber Italian'