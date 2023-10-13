desc marks;

DELIMITER //
CREATE PROCEDURE addMarks(roll char(3),increment int)
BEGIN 
	update marks set math=math+increment,english=english+increment where rollno=roll;
END
//
DELIMITER ;

call addMarks('101',500);
select * from marks;
drop procedure addMarks;
