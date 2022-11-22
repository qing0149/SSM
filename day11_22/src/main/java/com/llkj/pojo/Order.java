package com.llkj.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @ClassName Order
 * @Description TODO
 * @Author qing
 * @Date 2022/11/22 13:22
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private Integer orderId;
    private String  orderName;
    private Integer customerId;
    private Customer customer;
}
