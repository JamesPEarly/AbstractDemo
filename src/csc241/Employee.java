package csc241;

public abstract class Employee {

  // Instance variables
  private String lastName;
  private String firstName;

  // Constructor
  public Employee(String lastName, String firstName){
    this.lastName = lastName;
    this.firstName = firstName;
  }

  // Getters
  public String getLastName() {
    return lastName;
  }

  public String getFirstName() {
    return firstName;
  }

  // Abstract method
  public abstract void printPaycheck();
}
