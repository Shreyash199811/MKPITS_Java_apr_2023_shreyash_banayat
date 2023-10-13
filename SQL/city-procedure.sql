DELIMITER //
CREATE PROCEDURE print_name(city char(15))
BEGIN
	declare cust_city char(15);
    set cust_city=city;
    
    select city,first_name,last_name from
    city join address 
    on city.city_id=address.city_id
    join customer
    on address.address_id=customer.address_id
    where city=cust_city;
END
//
DELIMITER 

CALL print_name("Abu Dhabi");

drop procedure print_name;