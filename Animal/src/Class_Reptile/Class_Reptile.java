package Class_Reptile;

import Animal.Class_Animal;
//継承時にはimportが表示されると出来る　

public class Class_Reptile extends Class_Animal {
  private String skinType;
  private String bone;
  private String eggType;

  // Default Contructor
  public Class_Reptile() {
    this.skinType = "Soft";
    this.bone = "Backbone";
    this.eggType = "Soft Shell";
  }

  public Class_Reptile(String skinType, String bone, String eggtype, int height, int weight, String animalType,
      String bloodType) {
    // 親クラスのコンストラクタを呼び出す
    // We are using super to access parent class fields and update those values when
    // we get them from Reptile Object
    super(height, weight, animalType, bloodType);
    this.skinType = skinType;
    this.bone = bone;
    this.eggType = eggtype;

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

  public String getEggType() {
    return eggType;
  }

  public void setEggType(String eggType) {
    this.eggType = eggType;
  }

} // class
