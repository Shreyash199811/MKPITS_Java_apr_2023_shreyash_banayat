-- Trigger to Log User Activity:
-- Create a trigger that logs user activity, such as inserts, updates, or deletes, into a designated table
-- for auditing purposes.

create table user_logs(
user_name char(20),
trigger_event char(10)
)

#que10
DELIMITER //
CREATE TRIGGER n_user_log_INSERT
AFTER INSERT ON film_actor FOR EACH ROW
BEGIN 
    INSERT INTO user_logs values(USER_NAME(),'INSERTING');
END;
//
DELIMITER ;
    
    
DELIMITER //
CREATE TRIGGER n_user_log_UPDATE 
AFTER UPDATE ON film_actor FOR EACH ROW
BEGIN 
    INSERT INTO user_logs values(USER_NAME(),'UPDATING');
END;
//
DELIMITER ;

DELIMITER //
CREATE TRIGGER n_user_log_DELETE
AFTER DELETE ON film_actor FOR EACH ROW
BEGIN 
    INSERT INTO user_logs values(USER_NAME(),'DELETING');
END;
//
DELIMITER ;


insert into film_actor values(50,1500,curdate())

