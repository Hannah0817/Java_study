package Seriazable;

import java.io.Serializable;

//4、对象操作流
//    如果一个类的对象能够被序列化操作，必须实现Serializable接口，提供一个固定的序列化版本号。
//    练习将多个对象序列化到文件 并反序列化重构对象。
public class Student implements Serializable {
    private String name;
    private transient int age;
    private static final long serialVersionUID = 1L;

    public Student() {
    }

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
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;

    }
}

