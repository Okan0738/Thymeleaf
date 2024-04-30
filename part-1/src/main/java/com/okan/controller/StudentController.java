package com.okan.controller;

import com.okan.bootstrap.DataGenarator;
import com.okan.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping("/register") //
    public String register(Model model){
        model.addAttribute("student", DataGenarator.createStudents());


        return "student/register";
    }
    @RequestMapping("/drop") //
    public String drop(){
        return "student/register";
    }


}
