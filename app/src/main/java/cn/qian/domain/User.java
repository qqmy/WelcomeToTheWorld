package cn.qian.domain;

import java.io.Serializable;

/**
 * Created by qianmy on 2017/4/13.
 */
public class User implements Serializable {
    //姓名
    private String name;
    //年龄
    private int age;

    public User(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getAge() {

        return age;
    }

    public String getName() {

        return name;
    }
}
