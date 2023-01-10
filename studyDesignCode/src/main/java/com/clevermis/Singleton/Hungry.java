package com.clevermis.Singleton;

/**
 * @program: java-study
 * @description: 饿汉式单例
 * @author: Clevermis
 * @create: 2023-01-10 14:16
 * @since JDK 1.8
 **/
public class Hungry {

  private static final Hungry HUNGRY = new Hungry();

  private Hungry() {
  }

  public static Hungry getInstance() {
    return Hungry.HUNGRY;
  }

}
