package Class_Fish;

import Animal.Class_Animal;

public class Class_Fish extends Class_Animal {
  private String breathing;
  private boolean hasGills;

// Default Contructor
public Class_Fish(){
    this.breathing = "gill";
    this.hasGills = true;
}

  public Class_Fish(String breathing,boolean hasGills) {
    // super(Height, Weight, AnimalType, BloodType);
    this.breathing = breathing;
    this.hasGills = true;
  }

  public Class_Fish(String breathing, boolean hasGills, int height, int weight, String animalType,
      String bloodType) {
    super(height, weight, animalType, bloodType);
    this.breathing = breathing;
    this.hasGills = false;

  }
  public String getBreathing() {
    return breathing;
  }

  public void setBreathing(String breathing) {
    this.breathing = breathing;
  }

  public boolean isHasGills() {
    return hasGills;
  }

  public void setHasGills(boolean hasGills) {
    this.hasGills = hasGills;
  }

  // @Override
  // public void behaviour() {
  //   System.out.println("This animal has angry behaviour");
  // }
}
