package Class_Birds;

public class Class_Eagle extends Class_Birds{
  public Class_Eagle(){

  }

  public Class_Eagle(String skinType, String bone, String eggType, int height, int weight, String animalType, String bloodType){

    super(skinType, bone, eggType, height, weight, animalType, bloodType);
  
  }


  public void showInfo() {
    System.out.println(this.getSkinType());
    System.out.println(this.getBone());
    System.out.println(this.getEggtype());
    System.out.println(this.getHeight());
    System.out.println(this.getWeight());
    System.out.println(this.getAnimalType());
    System.out.println(this.getBloodType());
    
  }
}

