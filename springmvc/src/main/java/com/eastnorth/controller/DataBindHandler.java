package com.eastnorth.controller;

import com.eastnorth.bean.Address;
import com.eastnorth.bean.Student;
import com.eastnorth.bean.StudentList;
import com.eastnorth.bean.StudentMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

/**
 * @Auther: zuojianhou
 * @Date: 2020/1/1
 * @Description:
 */
@RestController
@RequestMapping("/data")
public class DataBindHandler {

    @RequestMapping("/baseType")
    public String baseType(String id) {
        return id + "";
    }

    @RequestMapping("/packageType")
    public String packageType(@RequestParam(value = "id", required = true, defaultValue = "0") Integer id) {
        return id + "";
    }

    @RequestMapping("/array")
    public String array(String[] name) {
        return Arrays.toString(name);
    }

    @RequestMapping("/list")
    public String List(StudentList list) {
        StringBuilder str = new StringBuilder();
        for (Student student : list.getStudents()) {
            str.append(student);
        }
        return str.toString();
    }

    @RequestMapping("/map")
    public String Map(StudentMap studentMap) {
        StringBuilder str = new StringBuilder();
        for (String key : studentMap.getStudents().keySet()) {
            Student student = studentMap.getStudents().get(key);
            str.append(student);
        }
        return str.toString();
    }

    @RequestMapping("/json")
    public Student json(@RequestBody Student student) {
        System.out.println(student.toString());
        student.setId("10");
        student.setName("五菱宏光");
        Address address = new Address();
        address.setValue("xxx");
        student.setAddress(address);
        return student;
    }
}
