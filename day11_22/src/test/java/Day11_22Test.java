import com.llkj.mapper.CustomerMapper;
import com.llkj.mapper.OrderMapper;
import com.llkj.pojo.Customer;
import com.llkj.pojo.Order;
import com.llkj.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @ClassName Day11_22Test
 * @Description TODO
 * @Author qing
 * @Date 2022/11/22 13:58
 * @Version 1.0
 */
public class Day11_22Test {
    @Test
    public void test1(){
        SqlSession sqlSession = MybatisUtils.openSession();
        CustomerMapper mapper = sqlSession.getMapper(CustomerMapper.class);
        List<Customer> customers = mapper.queryList();
        System.out.println(customers);
    }
    @Test
    public void test2(){
        SqlSession sqlSession = MybatisUtils.openSession();
        OrderMapper mapper = sqlSession.getMapper(OrderMapper.class);
        Order order = mapper.queryOrderById(1);
        System.out.println(order);

    }
}
