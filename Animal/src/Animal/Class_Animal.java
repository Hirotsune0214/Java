package Animal;


public class Class_Animal{
    private int height; 
    private int weight; 
    private String animalType;
    private String bloodType;

    public Class_Animal(){
        this.height = 0;
        this.weight = 0;
        this.animalType = "Unknown";
        this.bloodType = "Unknown";
    }

    public Class_Animal(int height, int weight, String animalType, String bloodType){
      this.height = height;
      this.weight = weight;
      this.animalType = animalType;
      this.bloodType = bloodType;
    }

     //Return the height
    public int getHeight() {
      return height;
    }

    //Change the value
    public void setHeight(int height) {
      this.height = height;
    }

    /*public void setHeight(int givenHeight) {
             this.Height = givenHeight;
    こっちの方が良い？？         
    */


    public int getWeight() {
      return weight;
    }


    public void setWeight(int weight) {
      this.weight = weight;
    }


    public String getAnimalType() {
      return animalType;
    }


    public void setAnimalType(String animalType) {
      this.animalType = animalType;
    }


    public String getBloodType() {
      return bloodType;
    }


    public void setBloodType(String bloodType) {
      this.bloodType = bloodType;
    }


  } //class

    

    /*値を追加することによって変更が出来る
    public void accelerate() {
      this.speed += 5;
      System.out.println("Speed of Bike Now : " + this.speed);
  }*/

  // public void behaviour(){
  //   System.out.println("This animal has angry behaviour");
  // }

  //     //Return the height
  //     public int getHeight() {
  //       return this.Height;
  //     }
  
  //     //Change the value
  //     public void setHeight(int givenHeight) {
  //       this.Height = givenHeight;
