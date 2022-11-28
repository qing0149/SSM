import com.llkj.dao.UserMapper;
import com.llkj.pojo.User;
import com.llkj.utils.MybatisUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @ClassName MyBatisTest
 * @Description TODO
 * @Author qing
 * @Date 2022/11/27 16:56
 * @Version 1.0
 */
@Slf4j
public class MyBatisTest {
    @Test
    public void test1() throws IOException {
        InputStream resource = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory build = sqlSessionFactoryBuilder.build(resource);
        SqlSession sqlSession = build.openSession();
        System.out.println(sqlSession);
    }

    @Test
    public void test2() {
        SqlSession sqlSession = MybatisUtils.getAutoSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setName("jing");
        user.setPassword("123456");
        Integer integer = mapper.InsertAccount(user);
        System.out.println(integer);
        log.info(user.toString());
        System.out.println("用户的id" + user.getId());
        sqlSession.close();
    }

    @Test
    public void test3() {
        SqlSession sqlSession = MybatisUtils.getAutoSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setName("qing");
        user.setPassword("123456");
        User user1 = mapper.Login(user);
//        log.info(user1.toString());
        System.out.println(user1);
    }
}
