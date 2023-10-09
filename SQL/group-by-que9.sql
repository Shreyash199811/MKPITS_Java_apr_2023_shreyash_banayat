-- 9. Retrieve the total revenue generated for each city.


#que9
select city,sum(amount)
from payment join customer
on payment.customer_id=customer.customer_id
join address
on customer.address_id=address.address_id
join city
on address.city_id=city.city_id
group by city
