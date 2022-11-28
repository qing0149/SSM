package com.llkj;

import com.llkj.Utils.MybatisUtils;
import com.llkj.mapper.StudentMapper;
import com.llkj.mapper.TeacherMapper;
import com.llkj.pojo.Student;
import com.llkj.pojo.Teacher;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @ClassName test
 * @Description TODO
 * @Author qing
 * @Date 2022/11/22 23:34
 * @Version 1.0
 */
public class test {
    @Test
    public void test1(){
        SqlSession sqlSession = MybatisUtils.getAutoSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> students = mapper.queryStudentById(1);
        System.out.println(students);
    }

    @Test
    public void test2(){
        SqlSession sqlSession = MybatisUtils.getAutoSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
//        List<Teacher> teachers = mapper.queryTeacherByStuId(1);
        List<Teacher> teachers = mapper.queryTeacherById(1);
        System.out.println(teachers);
    }
    @Test
    public void test3(){
        SqlSession sqlSession = MybatisUtils.getAutoSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
//        List<Student> students = mapper.queryStudentByIdDiv(1);
        Student student = mapper.queryStudentByIdDiv(1);
        System.out.println(student);
        System.out.println("分步查询的时候");
//        System.out.println(students);
        List<Student> students1 = mapper.queryStudentById2(1);
        System.out.println("但步查询的时候");
        System.out.println(students1);
    }
    @Test
    public void test4() {
        SqlSession sqlSession = MybatisUtils.getAutoSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> students = mapper.queryStudentById2(1);
        System.out.println(students);
    }
    @Test
    public void test5(){
        SqlSession sqlSession = MybatisUtils.getAutoSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> students = mapper.queryStudentSub("张三");
        System.out.println(students);
        for (Student student : students) {
            System.out.println(student);
        }



    }
}
