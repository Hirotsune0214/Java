// package dto;

// import java.util.IllformedLocaleException;

// public class User {


//   // Fileds
//   private int id;
//   private String name;
//   private String lastName;
//   private String email;
//   private String password;

//   //parameterized constructor
//   public User(int id,String name,String lastName, String email,String password){
//      this.id = id;
//      this.name = name;
//      this.lastName = lastName;
//      this.email = email;
//      this.password = password;
//   }

//   //IDはデータベースにあるから分からないので下記を作成
//   public User(String name,int studentID, String email,int studentRollNumber){
//     this.name = name;
//     this.lastName = studentID;
//     this.email = email;
//     this.password = studentRollNumber;
//  }

//   // Default Constructor 
//   public User() {

//   }

//   public int getId() {
//     return id;
//   }


//   public void setId(int id) {
//     this.id = id;
//   }


//   public String getName() {
//     return name;
//   }


//   public void setName(String name) {
//     this.name = name;
//   }


//   public String getLastName() {
//     return lastName;
//   }


//   public void setLastName(String lastName) {
//     this.lastName = lastName;
//   }


//   public String getEmail() {
//     return email;
//   }


//   public void setEmail(String email) {
//     this.email = email;
//   }


//   public String getPassword() {
//     return password;
//   }


//   public void setPassword(String password) {
//     this.password = password;
//   }
  
//   public void showInfo() { //\tの意味はtab
//     System.out.println(id + " \n" + name + "\t" + lastName + "\t" + password + "\t" + email);
//   }

//   public String getStudentID() {
//     return null;
//   }

//   public String getStudentRollNumber() {
//     return null;
//   }

//   public void setStudentID(int newStudentID) {
//   }

//   public void setStudentRollNumber(int newStundentRollNumber) {
//   }

// }
