package Class_Fish;

public class Class_Eel extends Class_Fish{
  public Class_Eel(){

  }

  public Class_Eel(String breathing, boolean hasGills, int height, int weight, String animalType, String bloodType){

    super(breathing, hasGills, height, weight, animalType, bloodType);
  }

  //boolean shouldn't be public void showInfo???
  public void showInfo() {
    System.out.println(this.getBreathing());
    System.out.println(this.getHeight());
    System.out.println(this.getWeight());
    System.out.println(this.getAnimalType());
    System.out.println(this.getBloodType());
  }
}
