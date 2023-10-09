-- 4. Stores with high revenue:
-- Find stores with total revenue exceeding $5000.


#que4
select store.store_id,sum(amount) as Total_revenue
from store join staff
on store.store_id=staff.store_id
join payment
on staff.staff_id=payment.staff_id
group by store_id
having sum(amount)>5000