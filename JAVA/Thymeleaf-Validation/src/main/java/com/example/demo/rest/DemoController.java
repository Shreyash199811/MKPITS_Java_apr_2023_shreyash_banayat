package com.example.demo.rest;

import com.example.demo.entity.Student;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;


@Controller
public class DemoController {

    @GetMapping("/form1")
    public String homePage(Model model){
        Student student=new Student();
        model.addAttribute("stud",student);
        return "form";
    }

    @GetMapping("/processData")
    public String processData(@Valid @ModelAttribute("stud") Student thestudent, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "form";
        }else {
        return "showData";
        }
    }


}
