package com.llkj.Factory;

import com.llkj.pojo.Person;
import org.springframework.beans.factory.FactoryBean;

/**
 * @ClassName PersonFactory
 * @Description TODO
 * @Author qing
 * @Date 2022/11/26 8:33
 * @Version 1.0
 */
public class PersonFactory implements FactoryBean<Person> {

    @Override
    public Person getObject() throws Exception {
        Person person = Person.getNewSystem();
        System.out.println(person);
        return person;
    }
    @Override
    public Class<?> getObjectType() {
        return null;
    }
}
