package com.eastnorth.controller;

import com.eastnorth.bean.Student;
import com.eastnorth.service.StudentOperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;

/**
 * @Auther: zuojianhou
 * @Date: 2019/12/28
 * @Description:
 */
@Controller
@RequestMapping("/hello")
public class HelloWorldHandler {

    @Autowired
    private StudentOperationService service;

    @RequestMapping("/index")
    public String index() {
        System.out.println("执行了index...");
        return "index";
    }

    @RequestMapping("/rest/{id}")
    public String rest(@PathVariable("id") String id) {
        System.out.println(id);
        return "index";
    }

    @RequestMapping("/cookie")
    public String cookie(@CookieValue(value = "JSESSIONID") String sessionId) {
        System.out.println(sessionId);
        return "index";
    }

    @RequestMapping("/save")
    public String save(Student student) {
        System.out.println(student);
        return "index";
    }

    @RequestMapping("/forward")
    public String forward() {
        System.out.println("转发成功");
        return "forward:/index.jsp";
    }

    @RequestMapping("/redirect")
    public String redirect() {
        System.out.println("重定向成功");
        return "redirect:/index.jsp";
    }

    @GetMapping("/list")
    @ResponseBody
    public Collections getList() {
        return service.getList();
    }

    @PostMapping("/add")
    @ResponseBody
    public String addStudent(@RequestBody Student student) {
        return service.addStudent(student);
    }

    @PutMapping("/update")
    @ResponseBody
    public String updateStudent(Student student) {
        return service.updateStudent(student);
    }

    @DeleteMapping("/delete")
    @ResponseBody
    public String deleteStudent(@RequestParam("id") String id) {
        return service.deleteStudent(id);
    }
}
