package com.example.demo.rest;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentServiceImp;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping("/")
public class StudentController {
    private StudentServiceImp studentServiceImp;

    public StudentController(StudentServiceImp studentServiceImp) {
        this.studentServiceImp = studentServiceImp;
    }

    @GetMapping("/form")
    public String homePage(Model model){
        Student student=new Student();
        model.addAttribute("stud",student);
        return "form";
    }

    @GetMapping("/display")
    public String display(Model model){
        List<Student> listStudent=studentServiceImp.findAll();
        model.addAttribute("s",listStudent);
        return "displayData";
    }

    @PostMapping("/insert")
    public String insertData(@ModelAttribute("call") Student theStudent){
         studentServiceImp.save(theStudent);
         return "redirect:/display";
    }

    @GetMapping ("/delete")
    public String deleteRecord(@RequestParam("roll_no") int rollNo,Model model){
        Student student=studentServiceImp.find(rollNo);
        studentServiceImp.delete(rollNo);
        return "redirect:/display";
    }

    @GetMapping("/update")
    public String updateRecord(@RequestParam("roll_no") Integer rollNo,Model model){
        Student student=studentServiceImp.update(rollNo);
        model.addAttribute("stud",student);
        return "form";
    }

    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public String exceptionHandling(){
        return "errorPage";
    }

}
