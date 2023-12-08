package com.example.demo.rest;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DemoController {

    @GetMapping("/form")
    public String homePage(Model model){
        return "form";
    }

    @GetMapping("/processData")
    public String processData(@RequestParam("s_rollno") String stud_rollNo,
                              @RequestParam("s_name") String stud_name,
                              @RequestParam("s_address") String stud_address, Model model){

        model.addAttribute("roll_no",stud_rollNo);
        model.addAttribute("name",stud_name);
        model.addAttribute("address",stud_address);
        return "showData";
    }


}
