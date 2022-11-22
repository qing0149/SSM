package com.llkj.dao;

import com.llkj.pojo.Emp;

import java.util.List;

/**
 * @ClassName EmpMapper
 * @Description TODO
 * @Author qing
 * @Date 2022/11/21 10:58
 * @Version 1.0
 */
public interface EmpMapper {
    List<Emp> selectEmpList();
    List<Emp> selectEmpByParam();
    List<Emp> selectOrderBy(String empID);
    List<Emp> selectOrderBySalary(String empID,Double salary);
    int insertEmp(Emp emp);

}
