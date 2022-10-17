package People;

public class Person {
  //下記がメソッド
  private String name;

  public void setName(String n){
    name = n;
  }
  public void display(){
    System.out.println("名前 " + name);
  }
}
