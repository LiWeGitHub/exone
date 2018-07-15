package com.controller;

import com.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2018/7/8
 */
@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentDao studentDao;
    @RequestMapping("/index")
    public String getIndex(Model model, HttpServletRequest request, @RequestParam  String stuid){
        String name = studentDao.getName(stuid);
        model.addAttribute("name",name);
        return "/index";
    }

    @RequestMapping("/getStudentName")
    public ModelAndView getStudentName(ModelAndView mv, @RequestParam String id) {
        mv.setViewName("index");
        return mv;
    }
}
