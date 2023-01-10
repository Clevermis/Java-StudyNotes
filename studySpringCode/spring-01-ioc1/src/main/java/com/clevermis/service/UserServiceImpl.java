package com.clevermis.service;

import com.clevermis.dao.UserDao;
import java.sql.SQLOutput;

/**
 * @program: java-study
 * @description:
 * @author: Clevermis
 * @create: 2023-01-10 13:52
 * @since JDK 1.8
 **/
public class UserServiceImpl implements UserService {

  private UserDao userDao;


  //利用set进行动态实现值的注入
  public void setUserDao(UserDao userDao) {
    System.out.println("1:"+userDao);
     this.userDao =userDao;
    System.out.println("2:"+userDao);
  }

  @Override
  public void getUser() {
    System.out.println("3:"+userDao);
      userDao.getUser();
  }
}
