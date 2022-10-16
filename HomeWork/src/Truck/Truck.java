package Truck;

import Vehicle.Vehicle;

public class Truck extends Vehicle{
  private int steering;
  private int stereo;
  private boolean seatBeltOn;
  private boolean ac;
  private int Container;

  public Truck(){

  }

  public Truck(int steering, int stereo, boolean seatBeltOn, boolean ac, int Container, int wheels,  int seats, String fuelTank,int light){
    super(wheels, seats, fuelTank,light);
    this.steering = steering;
    this.stereo = stereo;
    this.seatBeltOn = seatBeltOn;
    this.ac = ac;
    this.Container = Container;
  }

  public int getSteering() {
    return steering;
  }

  public void setSteering(int steering) {
    this.steering = steering;
  }

  public int getStereo() {
    return stereo;
  }

  public void setStereo(int stereo) {
    this.stereo = stereo;
  }

  public boolean isSeatBeltOn() {
    return seatBeltOn;
  }

  public void setSeatBeltOn(boolean seatBeltOn) {
    this.seatBeltOn = seatBeltOn;
  }

  public boolean isAc() {
    return ac;
  }

  public void setAc(boolean ac) {
    this.ac = ac;
  }

  public int getContainer() {
    return Container;
  }

  public void setContainer(int container) {
    Container = container;
  }
  
  public void noise(){
    System.out.println("GOOOOOOOOM");
  }


} //class
