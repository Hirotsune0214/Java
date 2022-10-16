package Class_Birds;

import Animal.Class_Animal;

public class Class_Birds extends Class_Animal{
  private String skinType;
  private String bone;
  private String eggtype;

  // Default Contructor
  public Class_Birds(){
    this.skinType = "Hard";
    this.bone = "Frontbone";
    this.eggtype = "Hard Shell";
  }

  public Class_Birds(String skinType, String bone, String eggtype, int Height, int Weight, String AnimalType, String BloodType){
      super(Height, Weight, AnimalType, BloodType);
      this.skinType = skinType;
      this.bone = bone;
      this.eggtype = eggtype;
  }

  public String getSkinType() {
    return skinType;
  }

  public void setSkinType(String skinType) {
    this.skinType = skinType;
  }

  public String getBone() {
    return bone;
  }

  public void setBone(String bone) {
    this.bone = bone;
  }

  public String getEggtype() {
    return eggtype;
  }

  public void setEggtype(String eggtype) {
    this.eggtype = eggtype;
  }
  
} //class
