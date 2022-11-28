package com.llkj.pojo;

/**
 * @ClassName Person
 * @Description TODO
 * @Author qing
 * @Date 2022/11/26 8:29
 * @Version 1.0
 */
public class Person {
    private static Person person = new Person();

    private Person() {
    }

    public static Person getNewSystem() {
        return person;
    }
}
