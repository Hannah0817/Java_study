package com.hainiu.homework1;
//1、熟练掌握标准javabean的编写
//    私有成员变量
//    提供无参数和全参数构造
//    提供get和set方法
//    打印对象查看属性方便 -- 生成toString方法
public abstract class person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public person() {
    }

    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
