-- 6. Staff with high customer interactions:
-- List staff members who have handled more than 500 customer transactions.


#que6
select staff.staff_id,count(payment_id) as Transactions
from staff join payment
on staff.staff_id=payment.staff_id
group by staff_id
having count(payment_id)>500