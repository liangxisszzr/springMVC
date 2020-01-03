package com.eastnorth.controller;

import com.eastnorth.bean.Student;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.InternalResourceView;

import javax.jws.WebParam;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: zuojianhou
 * @Date: 2020/1/2
 * @Description:
 */
@Controller
@RequestMapping("/view")
public class ViewHandler {

    @RequestMapping("/map")
    public String map(Map<String, Student> map) {
        Student student = new Student();
        student.setId("111");
        student.setName("德玛西亚");
        map.put("student", student);
        return "view";
    }

    @RequestMapping("/model")
    public String model(Model model) {
        Student student = new Student();
        student.setId("111");
        student.setName("德玛西亚");
        model.addAttribute("student", student);
        return "view";
    }

    @RequestMapping("/modelAndView")
    public ModelAndView modelAndView() {
        Student student = new Student();
        student.setId("111");
        student.setName("德玛西亚");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("student", student);
        modelAndView.setViewName("view");
        return modelAndView;
    }

    @RequestMapping("/modelAndView2")
    public ModelAndView modelAndView2() {
        Student student = new Student();
        student.setId("111");
        student.setName("德玛西亚");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("student", student);
        View view = new InternalResourceView("/view.jsp");
        modelAndView.setView(view);
        return modelAndView;
    }

    @RequestMapping("/modelAndView3")
    public ModelAndView modelAndView3() {
        Student student = new Student();
        student.setId("111");
        student.setName("德玛西亚");
        ModelAndView modelAndView = new ModelAndView("view");
        modelAndView.addObject("student", student);
        return modelAndView;
    }

    @RequestMapping("/modelAndView4")
    public ModelAndView modelAndView4() {
        Student student = new Student();
        student.setId("111");
        student.setName("德玛西亚");
        View view = new InternalResourceView("/view.jsp");
        ModelAndView modelAndView = new ModelAndView(view);
        modelAndView.addObject("student", student);
        return modelAndView;
    }

    @RequestMapping("/modelAndView5")
    public ModelAndView modelAndView5() {
        Student student = new Student();
        student.setId("111");
        student.setName("德玛西亚");
        Map<String, Student> map = new HashMap<>();
        map.put("student", student);
        ModelAndView modelAndView = new ModelAndView("view", map);
        return modelAndView;
    }

    @RequestMapping("/modelAndView6")
    public ModelAndView modelAndView6() {
        Student student = new Student();
        student.setId("111");
        student.setName("德玛西亚");
        Map<String, Student> map = new HashMap<>();
        map.put("student", student);
        View view = new InternalResourceView("/view.jsp");
        ModelAndView modelAndView = new ModelAndView(view, map);
        return modelAndView;
    }

    @RequestMapping("/modelAndView7")
    public ModelAndView modelAndView7() {
        Student student = new Student();
        student.setId("111");
        student.setName("德玛西亚");
        ModelAndView modelAndView = new ModelAndView("view", "student", student);
        return modelAndView;
    }

    @RequestMapping("/modelAndView8")
    public ModelAndView modelAndView8() {
        Student student = new Student();
        student.setId("111");
        student.setName("德玛西亚");
        View view = new InternalResourceView("/view.jsp");
        ModelAndView modelAndView = new ModelAndView(view, "student", student);
        return modelAndView;
    }

    @RequestMapping("/request")
    public String request(HttpServletRequest request) {
        Student student = new Student();
        student.setId("111");
        student.setName("德玛西亚");
        request.setAttribute("student", student);
        return "view";
    }

//    @ModelAttribute
//    public Student getStudent() {
//        Student student = new Student();
//        student.setId("111");
//        student.setName("德玛西亚");
//        return student;
//    }

//    @ModelAttribute
//    public void getStudent(Map<String, Student> map) {
//        Student student = new Student();
//        student.setId("111");
//        student.setName("德玛西亚");
//        map.put("student", student);
//    }

    @ModelAttribute
    public void getStudent(Model model) {
        Student student = new Student();
        student.setId("111");
        student.setName("德玛西亚");
        model.addAttribute("student", student);
    }

    @RequestMapping("/modelAttribute")
    public String modelAttribute() {
        return "view";
    }
}
