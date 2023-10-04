-- 6. Calculate the count of rentals handled by each staff member.

#que6
select staff_id,count(rental_id) as rentals_handled
from rental
group by staff_id