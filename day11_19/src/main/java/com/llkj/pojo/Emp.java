package com.llkj.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @ClassName Emp
 * @Description TODO
 * @Author qing
 * @Date 2022/11/19 14:47
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Emp implements Serializable {
    private Integer empId;
    private String empName;
    private Double empSalary;

}
