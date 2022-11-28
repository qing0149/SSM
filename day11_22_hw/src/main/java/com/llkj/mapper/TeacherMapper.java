package com.llkj.mapper;

import com.llkj.pojo.Teacher;

import java.util.List;

/**
 * @ClassName TeacherMapper
 * @Description TODO
 * @Author qing
 * @Date 2022/11/22 21:04
 * @Version 1.0
 */
public interface TeacherMapper {
    List<Teacher> queryTeacherById(Integer tid);
    List<Teacher> queryRelations(Integer tid);
    List<Teacher> queryTeacherByStuId(Integer sid);
}
