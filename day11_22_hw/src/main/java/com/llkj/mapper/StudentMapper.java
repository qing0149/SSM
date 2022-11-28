package com.llkj.mapper;

import com.llkj.pojo.Student;

import java.util.List;

/**
 * @ClassName StudentMapper
 * @Description TODO
 * @Author qing
 * @Date 2022/11/22 21:04
 * @Version 1.0
 */
public interface StudentMapper {
    List<Student> queryStudentById(Integer sid);
//    List<Student> queryStudentByIdDiv(Integer sid);
//    这个方法是分步的
    Student queryStudentByIdDiv(Integer sid);
    List<Student> queryStudentById2(Integer sid);
    List<Student> distributedQuery(Integer sid);
    List<Student> queryStudentSub(String name);

}
