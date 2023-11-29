package com.example.demoApplication;

import com.example.demoApplication.dao.StudentDao;
import com.example.demoApplication.dao.StudentDaoImp;
import com.example.demoApplication.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("Hello");
	}
	@Bean
	public CommandLineRunner commandLineRunner(StudentDao studentDao){
		return runner->{
			System.out.println("hii");
			createStudent(studentDao);
			recordFind(studentDao);
		};
	}

	public void createStudent(StudentDao studentDao){
		Student student=new Student("Harsh","Noida");
		studentDao.save(student);
	}

	public void recordFind(StudentDao studentDao)
	{
		Student student=studentDao.findStudent(3);
		System.out.println(student);
	}

	public void update(){
		StudentDao studentDao=new StudentDaoImp();
		student.updateRecord(2,"Prajwal","Hydrabad");
		student.updateRecord(7,"Twinkle","MP");
		student.updateRecord(8,"Neha","Neha");
	}


}
