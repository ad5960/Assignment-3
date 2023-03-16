package com.email.assignment2;

/**
 * Concrete EmailFactory class that generates personalized emails for Frequent customers.
 */
public class FrequentEmailFactory implements EmailFactory {
  /**
   * Generates a personalized email for Frequent customers.
   *
   * @return the email text
   */
  @Override
  public String generateEmail() {
    String email = "This is a Frequent Email";
    return email;
  }
}
