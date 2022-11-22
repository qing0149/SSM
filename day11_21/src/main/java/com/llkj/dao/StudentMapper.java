package com.llkj.dao;

import com.llkj.pojo.Student;
import lombok.extern.slf4j.Slf4j;

/**
 * @ClassName StudentMapper
 * @Description TODO
 * @Author qing
 * @Date 2022/11/21 23:39
 * @Version 1.0
 */

public interface StudentMapper {
    Integer insertStudent(Student student);
    Integer insertStudentByUUID(Student student);
}
