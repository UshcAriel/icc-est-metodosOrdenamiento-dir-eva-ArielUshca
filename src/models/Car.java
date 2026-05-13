package models;

public class Car {
  private String name;
  private int yeaar;
  public Car(String name, int yeaar) {
    this.name = name;
    this.yeaar = yeaar;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public int getYeaar() {
    return yeaar;
  }
  public void setYeaar(int yeaar) {
    this.yeaar = yeaar;
  }
  
}
