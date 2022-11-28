package com.llkj;

import com.llkj.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName test
 * @Description TODO
 * @Author qing
 * @Date 2022/11/25 10:00
 * @Version 1.0
 */
public class test {
    ApplicationContext applicationContext= new ClassPathXmlApplicationContext("springIoc.xml");
    @Test
    public void test1(){
        String applicationName = applicationContext.getApplicationName();
        System.out.println(applicationName);
        Object student = applicationContext.getBean("student");
        Student student1 = applicationContext.getBean("student", Student.class);
        Student bean = applicationContext.getBean(Student.class);
        System.out.println(student1);
        System.out.println(bean);
        System.out.println(student);
    }

}
