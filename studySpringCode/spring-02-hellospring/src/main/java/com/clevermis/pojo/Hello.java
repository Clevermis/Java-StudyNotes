package com.clevermis.pojo;

/**
 * @program: java-study
 * @description:
 * @author: Clevermis
 * @create: 2023-01-10 15:33
 * @since JDK 1.8
 **/
public class Hello {
  private String str;

  public Hello() {
  }

  public String getStr() {
    return this.str;
  }

  public void setStr(final String str) {
    this.str = str;
  }

  @Override
  public String toString() {
    return "Hello{" +
        "str='" + str + '\'' +
        '}';
  }
}
