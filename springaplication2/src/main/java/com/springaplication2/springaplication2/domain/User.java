package com.springaplication2.springaplication2.domain;

public class User {
  private String fullName;
  private String age;
  private boolean employed;
  private String gender;

  public User(String fullName, String age, boolean employed, String gender) {
    this.fullName = fullName;
    this.age = age;
    this.employed = employed;
    this.gender = gender;
  }

  //Default Constrcutor
  public User(){}

  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public String getAge() {
    return age;
  }

  public void setAge(String age) {
    this.age = age;
  }

  public boolean isEmployed() {
    return employed;
  }

  public void setEmployed(boolean employed) {
    this.employed = employed;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }
}
