package com.eastnorth.dao;

import com.eastnorth.bean.Student;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: zuojianhou
 * @Date: 2019/12/30
 * @Description:
 */
@Repository
public class StudentOperationImp implements StudentOperationMapper {

    private static final Map<String, Object> students = new HashMap<>();



    @Override
    public Collections getList() {
        return (Collections) students;
    }

    @Override
    public void addStudent(Student student) {
        students.put(student.getId(), student);
    }

    @Override
    public void updateStudentInfo(Student student) {
        students.put(student.getId(), student);
    }

    @Override
    public void deleteStudent(String id) {
        students.remove(id);
    }
}
