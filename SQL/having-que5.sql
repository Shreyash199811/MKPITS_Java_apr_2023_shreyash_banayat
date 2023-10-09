-- 5. Actors in popular films:
-- Show actors who have appeared in more than 10 films.

#que5
select actor.actor_id,first_name,last_name
from actor join film_actor
on actor.actor_id=film_actor.actor_id
group by actor_id
having count(film_id)>10

