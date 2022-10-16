package Class_Reptile;

public class Class_Crocodile extends Class_Reptile {
  public Class_Crocodile() {

  }

  public Class_Crocodile(String skinType, String bone, String eggType, int Height, int Weight, String animalType,
      String BloodType) {

    super(skinType, bone, eggType, Height, Weight, animalType, BloodType);

  }

  public void showInfo() {
      System.out.println(this.getSkinType());
      System.out.println(this.getBone());
      System.out.println(this.getEggType());
      System.out.println(this.getHeight());
      System.out.println(this.getWeight());
      System.out.println(this.getAnimalType());
      System.out.println(this.getBloodType());
  }

}
