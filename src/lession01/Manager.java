package lession01;

public class Manager extends Employee {

  public Manager(String firstName, String lastName, int age) {
    super(firstName, lastName, age);
    System.out.println("Title: Manager");
  }
}
