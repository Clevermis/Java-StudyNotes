package com.clevermis.dao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @program: java-study
 * @description:
 * @author: Clevermis
 * @create: 2023-01-10 21:12
 * @since JDK 1.8
 **/

@Component
@Scope("singleton")
public class User {
  @Value("clevermis")
  public String name ;

}
