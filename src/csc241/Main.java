package csc241;

public class Main {
  public static void main(String[] args) {
    // Create some employees
    Hourly h1 = new Hourly("Evans", "James");
    h1.setHours(40);
    h1.setHourlyRate(15.75);

    Hourly h2 = new Hourly("Foster", "Mary");
    h2.setHours(37.5);
    h2.setHourlyRate(16.50);

    Salaried s1 = new Salaried("Roberts", "Susan");
    s1.setSalary(86543);

    // Add each employee to array
    Employee[] allEmployees = new Employee[3];
    allEmployees[0] = h1;
    allEmployees[1] = h2;
    allEmployees[2] = s1;

    // Print all paychecks
    System.out.println("---=== Paychecks ===---");
    for (Employee e: allEmployees) {
      e.printPaycheck();
    }

  }
}