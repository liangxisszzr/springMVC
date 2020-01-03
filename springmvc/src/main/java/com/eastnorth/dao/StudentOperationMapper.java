package com.eastnorth.dao;

import com.eastnorth.bean.Student;

import java.util.Collections;
import java.util.Map;

/**
 * @Auther: zuojianhou
 * @Date: 2019/12/30
 * @Description:
 */
public interface StudentOperationMapper {
    Collections getList();
    void addStudent(Student student);
    void updateStudentInfo(Student student);
    void deleteStudent(String id);
}
