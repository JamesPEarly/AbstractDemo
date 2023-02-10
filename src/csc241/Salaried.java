package csc241;

import java.text.DecimalFormat;

public class Salaried extends Employee {

  // instance variables
  private double salary;

  // Constructor
  public Salaried(String lastName, String firstName) {
    super(lastName, firstName);
  }

  // Setters

  public void setSalary(double salary) {
    this.salary = salary;
  }

  @Override
  public void printPaycheck() {
    DecimalFormat f = new DecimalFormat("##.00"); // Round to two decimal places
    System.out.println(this.getLastName() + ", " +
        this.getFirstName() + ": " +
        f.format(salary / 26));
  }
}
