package lession01;

public class CEO extends Employee {

  public CEO(String firstName, String lastName, int age) {
    super(firstName, lastName, age);
    System.out.println("Title: CEO");
  }
}
