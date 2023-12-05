package com.example.demo.rest;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
    String stud_rollNo,stud_name,stud_address;
    @GetMapping("/form")
    public String homePage(Model model){
        return "form";
    }

    @GetMapping("/processData")
    public String processData(HttpServletRequest request, Model model){
         stud_rollNo=request.getParameter("s_rollno");
         stud_name=request.getParameter("s_name");
         stud_address=request.getParameter("s_address");

        model.addAttribute("roll_no",stud_rollNo);
        model.addAttribute("name",stud_name);
        model.addAttribute("address",stud_address);
        return "showData";
    }


}
