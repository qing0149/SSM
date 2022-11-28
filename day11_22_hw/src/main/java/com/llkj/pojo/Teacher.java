package com.llkj.pojo;

import lombok.Data;

import java.util.List;

/**
 * @ClassName Teacher
 * @Description TODO
 * @Author qing
 * @Date 2022/11/22 20:54
 * @Version 1.0
 */
@Data
public class Teacher {
    private Integer tId;
    private String tName;
    private List<Student> students;
}
