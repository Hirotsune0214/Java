import javax.crypto.interfaces.PBEKey;

public class Fruits {

  // Fields for the class fruits
  private String Name;
  private String Color;
  public int Weight;
  private boolean isTasty;
  private int Price;
  private String Quantity;

    //Condtructor = インスタンス 生成される際に実行されるメソッド
    public Fruits(){
      this.Name = "Grape";
      this.Color = "Purple";
      this.Weight = 4;
      this.isTasty = true;
      this.Price = 6;
      this.Quantity = "Good";
    }
  
    // public void addQuantity(){
    //     //値を自由に変えれるようにする
    //      this.Weight = this.Weight;
    //      this.Price = this.Price;
    //        //this.Quantity =  this.Quantity + 1;
    // }
  
    // My Constructor becomes Dyanmic(動的) Now 
    public Fruits(String Name, String Color, int Weight, int Price, String Quantity){
      this.Name = Name;
      this.Color = Color;
      this.Weight = Weight;
      this.isTasty = true;
      this.Price = Price;
      this.Quantity = Quantity;
  
    }

  public String getName() {
    return Name;
  }

  public void setName(String name) {
    Name = name;
  }

  public String getColor() {
    return Color;
  }

  public void setColor(String color) {
    Color = color;
  }

  public int getWeight() {
    return Weight;
  }

  public void setWeight(int weight) {
    Weight = weight;
  }

  public boolean isTasty() {
    return isTasty;
  }

  public void setTasty(boolean isTasty) {
    this.isTasty = isTasty;
  }

  public int getPrice() {
    return Price;
  }

  public void setPrice(int price) {
    Price = price;
  }

  public String getQuantity() {
    return Quantity;
  }

  public void setQuantity(String quantity) {
    Quantity = quantity;
  }
  
} //class Fruits