package com.eastnorth.service;

import com.eastnorth.bean.Student;
import com.eastnorth.dao.StudentOperationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;

/**
 * @Auther: zuojianhou
 * @Date: 2019/12/30
 * @Description:
 */
@Service
public class StudentOperationService {

    @Autowired
    private StudentOperationMapper mapper;

    public Collections getList() {
        return mapper.getList();
    }

    public String addStudent(Student student) {
        try {
            mapper.addStudent(student);
            return "添加成功";
        } catch (Exception e) {
            return "添加失败";
        }
    }

    public String updateStudent(Student student) {
        try {
            mapper.updateStudentInfo(student);
            return "更新成功";
        } catch (Exception e) {
            return "更新失败";
        }
    }

    public String deleteStudent(String id) {
        try {
            mapper.deleteStudent(id);
            return "删除成功";
        } catch (Exception e) {
            return "删除失败";
        }
    }
}
