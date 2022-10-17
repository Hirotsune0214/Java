public class Fruits {
  // Fields for the class fruits
  private String name;
  private String color;
  public int weight;
  private boolean isTasty;
  public int price;
  public int quantity;

    //Condtructor = インスタンス 生成される際に実行されるメソッド
    public Fruits(){
      this.name = "Grape";
      this.color = "Purple";
      this.weight = 0;
      this.isTasty = true;
      this.price = 0;
      this.quantity = 1;
    }
  
    public void addQuantity() {
        this.weight = this.weight + 5; //9 
        this.price = this.price + 4; //4
        this.quantity = this.quantity + 1;
    }


    public void removeQuantity() {
      this.weight = this.weight - 1; //9 
      this.price = this.price - 1; //4 
      this.quantity = this.quantity - 1;
  }
} //class Fruits Fruits 
