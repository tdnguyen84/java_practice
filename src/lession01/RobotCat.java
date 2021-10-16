package lession01;

public class RobotCat {
  public RobotCat() {

  }

  private String name;
  private String productionAge;

  public RobotCat(String name, String productionDate) {
    this.name = name;
    this.productionAge = productionDate;
  }

//  public RobotCat(String name) {
//    this.name = name;
//  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getProductionAge() {
    return productionAge;
  }

  public void setProductionAge(String productionAge) {
    this.productionAge = productionAge;
  }
}
