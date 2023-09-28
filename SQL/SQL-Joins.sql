use sakila
show tables
select * from actor
 select * from address
select * from category
select * from city
select * from country
select * from rental
select * from customer
select * from film
select * from film_actor
select * from film_category
select * from film_text
select* from inventory
select * from language
select * from payment
select * from staff
select * from store



#Que 1
select first_name,last_name,title 
from customer join rental 
on customer.customer_id=rental.customer_id
join 


#Que2 
select rental_date,return_date,first_name,last_name
from rental join customer
on rental.customer_id=customer.customer_id


#Que3 
select first_name,last_name,title 
from actor join film_actor
on actor.actor_id=film_actor.actor_id 
join film 
on film_actor.film_id=film.film_id
where title='Chamber Italian'

#Que4
select title 
from film join rental
on film.film_id=rental


#Que10
select First_name,Last_name,rental_date,datediff(return_date,rental_date) rental_duration
from customer join rental
on customer.customer_id=rental.customer_id
where first_name='Linda' and last_name='Williams'

#Que13
select first_name,last_name
from payment join customer
on payment.customer_id=customer.customer_id
where payment.customer_id>5


#Que15
select rental_date,return_date
from rental join customer
on rental.customer_id=customer.customer_id
where first_name='Richard' and last_name='Davis'

#Que20
select First_name,Last_name,rental_date,datediff(return_date,rental_date) rental_duration
from customer join rental
on customer.customer_id=rental.customer_id
where first_name='Karen' and last_name='Smith'

#Que23
select first_name,last_name,email
from payment join customer
on payment.customer_id=customer.customer_id
where payment.customer_id>10	
group by first_name,last_name,email


#Que25
select rental_date,return_date 
from customer join rental
on customer.customer_id=rental.customer_id
where first_name='Susan' and last_name='Johnson'


#Que28
select First_name,Last_name,rental_date,datediff(return_date,rental_date) rental_duration
from customer join rental
on customer.customer_id=rental.customer_id
where first_name='Joseph' and last_name='Brown'
