package com.aettoumi.designpattern.singleton;

import java.util.Date;

public class SingletonTest {

  public static void main(String[] args) {
    SingletonClass singletonClass1 =
        SingletonClass.getCurrentInstance("this is a singleton example.", new Date());
    System.out.println(singletonClass1);

    SingletonClass singletonClass2 = SingletonClass.getCurrentInstance();
    System.out.println(singletonClass2);
  }

}
