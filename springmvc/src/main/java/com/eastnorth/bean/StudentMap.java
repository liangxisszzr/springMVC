package com.eastnorth.bean;

import lombok.Data;

import java.util.Map;

/**
 * @Auther: zuojianhou
 * @Date: 2020/1/2
 * @Description:
 */
@Data
public class StudentMap {
    private Map<String, Student> students;
}
