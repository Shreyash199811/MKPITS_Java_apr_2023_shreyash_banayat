package com.example.demo.rest;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentServiceImp;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api")
public class StudentController {
    private StudentServiceImp studentServiceImp;

    public StudentController(StudentServiceImp studentServiceImp) {
        this.studentServiceImp = studentServiceImp;
    }

    @GetMapping("/alldata")
    public List<Student> display(){
        return studentServiceImp.findAll();
    }

    @PostMapping("/insert")
    public Student insertData(@RequestBody Student student){
        return studentServiceImp.save(student);
    }

    @DeleteMapping("/delete/{roll_number}")
    public String deleteData(@PathVariable Integer roll_number){
        studentServiceImp.delete(roll_number);
        return "data deleted";
    }

    @GetMapping("/show/{rollNo}")
    public Student findParticular(@PathVariable Integer rollNo){
        return studentServiceImp.findParticular(rollNo);
    }

    @PutMapping("/update")
    public Student updateRecord(@RequestBody Student student){
        return studentServiceImp.update(student);
    }


    @PutMapping("/multiupdate")
    public List<Student> multiInsert(@RequestBody List<Student> studentList){
        studentServiceImp.multiInsert(studentList);
        return studentList;
    }
}
