use stud_man;
select * from studentdetails;
create table pcm_marks(student_rollno char(4),physics int,chemistry int,math int);
drop table pcm_marks
create table total_marks(rollno char(4),total int)



DELIMITER //
CREATE TRIGGER update_total
AFTER INSERT ON pcm_marks FOR EACH ROW
BEGIN
	insert into total_marks values(new.student_rollno,new.physics+new.chemistry+new.math);
END;
//
DELIMITER 

drop trigger update_total_marks;

insert into pcm_marks value('101',80,60,74);
insert into pcm_marks value('102',74,68,70);
insert into pcm_marks value('103',84,98,90);
insert into pcm_marks value('104',79,88,80);
insert into pcm_marks value('105',84,88,86);

select * from total_marks;
select * from pcm_marks;



DELIMITER //
CREATE TRIGGER update_total_marks
AFTER update ON pcm_marks FOR EACH ROW
BEGIN
	update total_marks
    set total=new.physics+new.chemistry+new.math
    where rollno=new.student_rollno;
END;
//
DELIMITER ;

update pcm_marks set physics=physics+1000 where student_rollno='101';

select * from total_marks;








