import com.llkj.pojo.Emp;
import com.llkj.pojo.Student;
import com.llkj.utils.MybatisUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

/**
 * @ClassName MybatisTest
 * @Description TODO
 * @Author qing
 * @Date 2022/11/19 14:52
 * @Version 1.0
 */
public class MybatisTest {
    @Test
    public void test1() throws IOException {
        InputStream resource = Resources.getResourceAsStream("mybatis-config.xml");
        //创建一个mybatis的固定工厂
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
//        构架sqlSessiond的
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(resource);
        //进行数据库的操作
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<Emp> selectEmpList = sqlSession.selectList("selectEmpList");
        System.out.println(selectEmpList);
//        关闭资源
        sqlSession.close();
    }
    @Test
    public void test2() throws IOException {
        InputStream resource = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory build = sqlSessionFactoryBuilder.build(resource);
        SqlSession sqlSession = build.openSession(true);//事务没有提交
        Student student = new Student(1,"张三","男");
        int createStudent = sqlSession.insert("createStudent", student);
        System.out.println("createStudent = " + createStudent);
        sqlSession.close();
    }
    @Test
    public void test3() throws IOException {
        InputStream resource = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory build = sqlSessionFactoryBuilder.build(resource);
        SqlSession sqlSession = build.openSession(true);
        Student student = new Student(1, "李四", null);
        int updateStudentById = sqlSession.update("updateStudentById", student);
        System.out.println("updateStudentById = " + updateStudentById);
    }
    @Test
    public void test4(){
        SqlSession sqlSession = MybatisUtils.openAutoSession();
//        Student student = new Student();
        HashMap<String, String> map = new HashMap<>();
        map.put("id","1");
        map.put("name","美羊羊");
        int updateStudentById = sqlSession.update("updateStudentById", map);
        System.out.println("updateStudentById = " + updateStudentById);
    }
}
