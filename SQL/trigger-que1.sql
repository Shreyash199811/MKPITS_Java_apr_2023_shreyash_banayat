-- Trigger to Update Rental History:
-- Create a trigger that updates the rental history table whenever a new rental record is inserted into the rental table.
use sakila

#que1
create table new_rental_history
(
rental_id int,
rental_date datetime,
customer_id smallint,
return_date datetime,
last_update timestamp)

DELIMITER //
CREATE TRIGGER insert_rental
after insert on rental for each row
begin
	insert into new_rental_history values(new.rental_id,new.rental_date,new.customer_id,new.return_date,new.last_update);
end
//
DELIMITER ;

INSERT into rental values(17001,'2010-05-24 22:53:30',1711,400,'2010-06-30 11:40:40',2,curdate());

select * from new_rental_history;
