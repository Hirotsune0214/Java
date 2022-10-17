package People;


public class Student extends Person{
  //継承
  private int stuNo;

  public void setStuNo(int s){
    stuNo = s;
  }
  public void displayStuNo(){
    System.out.println("学籍番号 : " + stuNo);
  }
}
