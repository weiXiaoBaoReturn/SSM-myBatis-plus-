package com.my.ssm.controller;

import com.my.ssm.entity.Student;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by wbb01 on 2017/5/4.
 */
@RestController
@RequestMapping("/student")
public class StudentController {
    @RequestMapping(value = "student",method = RequestMethod.GET)
    public ModelAndView student(ModelMap modelMap){
        return  new ModelAndView("student","command",new Student());
    }
    @RequestMapping(value = "/addStudent",method = RequestMethod.POST)
    public  ModelAndView addStudent(@ModelAttribute Student student, ModelMap model){
            model.addAttribute("name",student.getName());
            model.addAttribute("age",student.getAge());
            model.addAttribute("id",student.getId());
            return new ModelAndView("result",model);
    }
}
