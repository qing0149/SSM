package com.llkj.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @ClassName MybatisUtils
 * @Description 用于简化sqlsession的操作对象
 * @Author qing
 * @Date 2022/11/19 16:48
 * @Version 1.0
 */
public class MybatisUtils {
    private static SqlSessionFactory sqlSessionFactory = null;
    //非静态使用单例模式构造函数
    //静态的写在代码块中
    static {
        try {
            InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
            sqlSessionFactory = sqlSessionFactoryBuilder.build(resourceAsStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    /*
    返回sqlsession,返回非自动提交
     */
    public static SqlSession openSession() {
        return sqlSessionFactory.openSession();
    }
    /*
    返回自动自动语句
     */
    public static SqlSession openAutoSession() {
        return sqlSessionFactory.openSession(true);
    }
}
