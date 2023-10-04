-- 4. Find the total revenue generated for each month.

#que4
select month(payment_date),sum(amount)
from payment
 group by month(payment_date)
