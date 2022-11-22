package com.llkj.test;


import com.llkj.dao.EmpMapper;
import com.llkj.dao.StudentMapper;
import com.llkj.pojo.Emp;
import com.llkj.pojo.Student;
import com.llkj.utils.MybatisUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;


import java.util.List;
import java.util.UUID;

/**
 * @ClassName EmpTest
 * @Description TODO
 * @Author qing
 * @Date 2022/11/21 11:01
 * @Version 1.0
 */
@Slf4j
public class EmpTest {

    @Test
    public void test1() {
        SqlSession sqlSession = MybatisUtils.openSession();
//        动态代理getMapper(EmpMapper.class),代理对象
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        List<Emp> emps = mapper.selectEmpList();
        System.out.println("emps = " + emps);
    }

    @Test
    public void test2() {
        SqlSession sqlSession = MybatisUtils.openAutoSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp emp = new Emp();
        emp.setEmpName("美羊羊1");
        emp.setEmpSalary(265.0);
        int i = mapper.insertEmp(emp);
//        System.out.println("i = " + i);
        System.out.println(emp.getEmpId());
        sqlSession.close();
    }
//    private Logger  logger =  LoggerFactory.getLogger(LogbackTest.class);

    @Test
    public void test3() {
//        Logger logger = LoggerFactory.getLogger(EmpTest.class);
//        logger.debug("---------这是debug");
//        logger.info("----------这是info");
//        logger.warn("---------这是警告");
//        logger.error("-------error");
//        log.info("info");
//        log.error("错误");
//        log.warn("警告");
//        log.debug("debug");
    }

    @Test
    public void EmpTest2() {
        SqlSession sqlSession = MybatisUtils.openAutoSession();
        EmpMapper empMapper = sqlSession.getMapper(EmpMapper.class);
        List<Emp> desc = empMapper.selectOrderBy("desc");
        System.out.println("desc = " + desc);
        System.out.println("-------------");
        List<Emp> asc = empMapper.selectOrderBy("asc");
        System.out.println(asc);
    }

    @Test
    public void EmpTest3() {
        SqlSession sqlSession = MybatisUtils.openAutoSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        List<Emp> asc = mapper.selectOrderBySalary("asc", 201.0);
        System.out.println(asc);
    }

    @Test
    public void TeacherTest1() {
        SqlSession sqlSession = MybatisUtils.openAutoSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        Student student = new Student();
        student.setName("张三丰");
        student.setSex("男");
//        Integer id = mapper.insertStudent(student);
        Integer id = mapper.insertStudentByUUID(student);
        System.out.println(id);
        System.out.println(student.getId());
    }

    @Test
    public void t2() {
        SqlSession sqlSession = MybatisUtils.openAutoSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        Student student = new Student();
        String id = UUID.randomUUID().toString().replace("-", "");
        student.setId(id);
        student.setName("李白1");
        student.setSex("女");
        Integer primaryKey = mapper.insertStudent(student);
        System.out.println("主键值"+student.getId());
    }
}
