package com.email.assignment2;

/**
 * EmailFactoryCreator returns the appropriate EmailFactory object based on the customer type.
 */
public class EmailFactoryCreator {
  /**
   * Returns an instance of the EmailFactory that corresponds to the specified customer type.
   *
   * @param customerType the type of customer
   * @return an instance of the corresponding EmailFactory
   * @throws IllegalArgumentException if the customer type is invalid
   */
  public static EmailFactory createEmailFactory(String customerType) {
    if (customerType.equals("Business")) {
      return new BusinessEmailFactory();
    } else if (customerType.equals("Returning")) {
      return new ReturningEmailFactory();
    } else if (customerType.equals("Frequent")) {
      return new FrequentEmailFactory();
    } else if (customerType.equals("New")) {
      return new NewEmailFactory();
    } else if (customerType.equals("VIP")) {
      return new Vipemailfactory();
    } else {
      throw new IllegalArgumentException("Invalid type of customer");
    }
  }
}


