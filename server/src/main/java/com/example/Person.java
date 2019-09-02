package com.example;

/**
 * This is a class.
 */
public class Person {

  /**
   * This is a constructor.
   */
  public Person() {

  }

  /**
   * @param someone 是人名
   * @return 字符串
   */
  public final String person(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
