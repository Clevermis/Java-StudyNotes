package com.clevermis.pojo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @program: java-study
 * @description:
 * @author: Clevermis
 * @create: 2023-01-10 17:12
 * @since JDK 1.8
 **/
public class Student {

  private String name;
  private Address address;
  private String[] books;
  private List<String> hobbies;
  private Map<String, String> card;
  private Set<String> games;
  private String wife;
  private Properties info;

  public String getName() {
    return this.name;
  }

  public void setName(final String name) {
    this.name = name;
  }

  public Address getAddress() {
    return this.address;
  }

  public void setAddress(final Address address) {
    this.address = address;
  }

  public String[] getBooks() {
    return this.books;
  }

  public void setBooks(final String[] books) {
    this.books = books;
  }

  public List<String> getHobbies() {
    return this.hobbies;
  }

  public void setHobbies(final List<String> hobbies) {
    this.hobbies = hobbies;
  }

  public Map<String, String> getCard() {
    return this.card;
  }

  public void setCard(final Map<String, String> card) {
    this.card = card;
  }

  public Set<String> getGames() {
    return this.games;
  }

  public void setGames(final Set<String> games) {
    this.games = games;
  }

  public String getWife() {
    return this.wife;
  }

  public void setWife(final String wife) {
    this.wife = wife;
  }

  public Properties getInfo() {
    return this.info;
  }

  public void setInfo(final Properties info) {
    this.info = info;
  }

  @Override
  public String toString() {
    return "Student{" +
        "name='" + name + '\'' +
        ", address=" + address +
        ", books=" + Arrays.toString(books) +
        ", hobbies=" + hobbies +
        ", card=" + card +
        ", games=" + games +
        ", wife='" + wife + '\'' +
        ", info=" + info +
        '}';
  }
}
