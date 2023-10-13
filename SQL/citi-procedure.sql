DELIMITER //
CREATE PROCEDURE print(citi varchar(50))
BEGIN
    select city,first_name,last_name from
    city join address 
    on city.city_id=address.city_id
    join customer
    on address.address_id=customer.address_id
    where city=citi;
END
//
DELIMITER 

CALL print('Abha');

drop procedure print;