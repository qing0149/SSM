package com.llkj.pojo;

import lombok.Data;

import java.util.List;

/**
 * @ClassName Student
 * @Description TODO
 * @Author qing
 * @Date 2022/11/22 20:54
 * @Version 1.0
 */
@Data
public class Student {
    private Integer sId;
    private String sName;
    private List<Integer> tIds;
    private List<Teacher> teachers;

}
