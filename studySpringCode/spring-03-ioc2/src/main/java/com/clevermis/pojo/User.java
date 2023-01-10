package com.clevermis.pojo;

/**
 * @program: java-study
 * @description:
 * @author: Clevermis
 * @create: 2023-01-10 16:25
 * @since JDK 1.8
 **/
public class User {
  private String name;

  public User() {
  }

  public User(final String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void setName(final String name) {
    this.name = name;
  }
}
