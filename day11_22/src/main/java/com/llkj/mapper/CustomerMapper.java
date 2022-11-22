package com.llkj.mapper;

import com.llkj.pojo.Customer;

import java.util.List;

/**
 * @ClassName CustomerMapper
 * @Description TODO
 * @Author qing
 * @Date 2022/11/22 13:34
 * @Version 1.0
 */
public interface CustomerMapper {
    List<Customer> queryList();

}
