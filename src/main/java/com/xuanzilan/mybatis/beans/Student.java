package com.xuanzilan.mybatis.beans;

/**
 * @author dengshaoheng
 */
public class Student {
    private Integer id;
    private String name;
    private int age;
    private double store;

    public Student() {
    }

    public Student(String name, int age, double store) {
        this.name = name;
        this.age = age;
        this.store = store;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public double getStore() {
        return store;
    }

    public void setStore(double store) {
        this.store = store;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", store=" + store +
                '}';
    }
}
