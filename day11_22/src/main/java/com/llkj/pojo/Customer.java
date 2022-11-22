package com.llkj.pojo;

import lombok.Data;

import java.util.List;

/**
 * @ClassName Customer
 * @Description TODO
 * @Author qing
 * @Date 2022/11/22 13:22
 * @Version 1.0
 */
@Data
public class Customer {
    private Integer customerId;
    private String customerName;
    private List<Order> orders;
}
