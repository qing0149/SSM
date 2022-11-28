import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import util.MybatisUtils;

/**
 * @ClassName tt
 * @Description TODO
 * @Author qing
 * @Date 2022/11/23 13:48
 * @Version 1.0
 */
public class tt {
    @Test
    public void test(){
        SqlSession autoSession = MybatisUtils.getAutoSession();

    }
}
