package com.aettoumi.designpattern.singleton;

import java.util.Date;

/**
 * 
 * @author ahmed.ettoumi@gmail.com
 *
 */
public class SingletonClass {

  private static SingletonClass singletonClass;

  /**
   * it's important to make all constructors to private
   */
  private SingletonClass() {}

  private SingletonClass(final String description, final Date date) {
    this.description = description;
    this.date = date;
  }



  public static SingletonClass getCurrentInstance() {
    if (singletonClass == null) {
      singletonClass = new SingletonClass();
    }
    return singletonClass;
  }

  public static SingletonClass getCurrentInstance(final String description, final Date date) {
    if (singletonClass == null) {
      singletonClass = new SingletonClass(description, date);
    } else {
      singletonClass.setDescription(description);
      singletonClass.setDate(date);
    }

    return singletonClass;
  }

  private String description;
  private Date date;

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  @Override
  public String toString() {
    return "SingletonClass [description=" + description + ", date=" + date + "]";
  }

}
