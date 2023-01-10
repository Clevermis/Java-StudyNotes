package com.clevermis.pojo;

/**
 * @program: java-study
 * @description:
 * @author: Clevermis
 * @create: 2023-01-10 17:12
 * @since JDK 1.8
 **/
public class Address {
  private String address;

  public String getAddress() {
    return this.address;
  }

  public void setAddress(final String address) {
    this.address = address;
  }

  @Override
  public String toString() {
    return "Address{" +
        "address='" + address + '\'' +
        '}';
  }
}
