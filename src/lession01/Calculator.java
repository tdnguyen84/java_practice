package lession01;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
  public static void main(String[] args) {
    CEO ceo = new CEO("Mark", "John", 50);
    ceo.setSalary(50000);

    Manager manager = new Manager("Zack", "Morgan", 30);
    manager.setSalary(40000);

    Employee employee = new Employee("Thompson", "Ryan", 20);
    employee.setSalary(10000);

    List<Employee> lstEmployee = new ArrayList<>();
    lstEmployee.add(ceo);
    lstEmployee.add(manager);
    lstEmployee.add(employee);

    System.out.println(String.format("=== Total salary: %s", calculateSalary(lstEmployee)));
  }

  public static double calculateSalary(List<Employee> employees) {
    double totalSalary = 0;
    for(Employee employee : employees) {
      totalSalary += employee.getSalary();
    }
    return totalSalary;
  }
}
