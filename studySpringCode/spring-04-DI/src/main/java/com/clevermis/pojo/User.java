package com.clevermis.pojo;

/**
 * @program: java-study
 * @description:
 * @author: Clevermis
 * @create: 2023-01-10 17:15
 * @since JDK 1.8
 **/
public class User {
  private String name;
  private int age;


  public User() {
  }

  public User(final String name, final int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public String toString() {
    return "User{" +
        "name='" + name + '\'' +
        ", age=" + age +
        '}';
  }

  public String getName() {
    return this.name;
  }

  public void setName(final String name) {
    this.name = name;
  }

  public int getAge() {
    return this.age;
  }

  public void setAge(final int age) {
    this.age = age;
  }
}
