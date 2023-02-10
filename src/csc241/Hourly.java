package csc241;

import java.text.DecimalFormat;

public class Hourly extends Employee {

    // Instance variables
    private double hours;
    private double hourlyRate;

  public Hourly(String lastName, String firstName) {
    super(lastName, firstName);
  }

  // Setters

  public void setHours(double hours) {
    this.hours = hours;
  }

  public void setHourlyRate(double hourlyRate) {
    this.hourlyRate = hourlyRate;
  }

  @Override
  public void printPaycheck() {
    DecimalFormat f = new DecimalFormat("##.00"); // Round to two decimal places
    System.out.println(this.getLastName() + ", " +
        this.getFirstName() + ": " +
        f.format(hours * hourlyRate));
  }
}
