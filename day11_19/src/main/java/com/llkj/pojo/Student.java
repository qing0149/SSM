package com.llkj.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Student
 * @Description TODO
 * @Author qing
 * @Date 2022/11/19 16:00
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private Integer id;
    private String name;
    private String sex;
}
