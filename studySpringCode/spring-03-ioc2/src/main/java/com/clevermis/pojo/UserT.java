package com.clevermis.pojo;

import java.sql.SQLOutput;

/**
 * @program: java-study
 * @description:
 * @author: Clevermis
 * @create: 2023-01-10 16:47
 * @since JDK 1.8
 **/
public class UserT {
  private String name;

  public String getName() {
    return this.name;
  }

  public UserT(final String name) {
    this.name = name;
  }

  public void setName(final String name) {
    this.name = name;
  }

  public UserT() {
  }
}
