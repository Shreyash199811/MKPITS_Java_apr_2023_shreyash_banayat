package com.example.demo.rest;

import com.example.demo.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DemoController {

    @GetMapping("/form")
    public String homePage(Model model){
        Student student=new Student();
        model.addAttribute("stud",student);
        return "form";
    }

    @PostMapping("/processData")
    public String processData(@ModelAttribute("stud") Student thestudent){
        return "showData";
    }


}
