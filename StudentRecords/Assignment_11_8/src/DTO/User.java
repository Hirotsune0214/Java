package DTO;

import java.rmi.StubNotFoundException;
import java.util.IllformedLocaleException;

public class User {

  // Fileds
  private int id;
  private String name;
  private int StudentID;
  private String email;
  private int StudentRollNumber;

  // parameterized constructor
  public User(int id, String name, int StundentID, String email, int StudentRollNumber) {
    this.id = id;
    this.name = name;
    this.StudentID = StundentID;
    this.email = email;
    this.StudentRollNumber = StudentRollNumber;
  }

  // IDはデータベースにあるから分からないので下記を作成
  public User(String name, int StudentID, String email, int StudentRollNumber) {
    this.name = name;
    this.StudentID = StudentID;
    this.email = email;
    this.StudentRollNumber = StudentRollNumber;
  }

  // Default Constructor
  public User() {

  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getStudentID() {
    return StudentID;
  }

  public void setStudentID(int studentID) {
    StudentID = studentID;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public int getStudentRollNumber() {
    return StudentRollNumber;
  }

  public void setStudentRollNumber(int studentRollNumber) {
    StudentRollNumber = studentRollNumber;
  }

  public void showInfo() { // \tの意味はtab
    System.out.println(id + " \n" + name + "\t" + email + "\t" + StudentRollNumber + "\t" + StudentID);
  }

}
