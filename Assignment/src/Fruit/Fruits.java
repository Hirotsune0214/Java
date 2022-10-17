package Fruit;

public class Fruits {
  // Fields for the class fruits
  private String name;
  private String color;
  public int weight;
  private boolean isTasty;
  private int price;
  private String quantity;

    //Condtructor = インスタンス 生成される際に実行されるメソッド
    public Fruits(){
      this.name = "Grape";
      this.color = "Purple";
      this.weight = 4;
      this.isTasty = true;
      this.price = 6;
      this.quantity = "Good";
    }
  
    public void addQuantity() {
        this.weight = this.weight + 5;
    }

  

} //class Fruits