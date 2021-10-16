package lession01;

public class Employee {
  private String firstName;
  private String lastName;
  private int age;
  private String startDate;
  private double salary;

  public Employee(String firstName, String lastName, int age) {
    System.out.println(String.format("This is '%s %s: %s years old'", lastName, firstName, age));
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

}
