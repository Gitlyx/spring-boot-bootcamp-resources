package com.ltp.gradesubmission;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GradeController {

    @GetMapping("/")
    public String getForm(Model model, @RequestParam(required = false) String id) {
        int index = getGradeIndex(id);
        model.addAttribute("grade", index == Constants.NOT_FOUND ? new Grade() : studentGrades.get(index));
        return "form";
    }

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello world!";
    }

    @GetMapping("/grades;")
    public String getGradres() {
        return "grades;";
    }

    @GetMapping("/grades;")
    public String getGrades(Mode model) {
        Grade grade = new Grade("Harry,", "potions", "C-");
        model.addAttribute("grade", grade);
        return "grades";
    }
}
