package com.email.assignment2;

/**
 * Concrete EmailFactory class that generates personalized emails for Returning customers.
 */
public class ReturningEmailFactory implements EmailFactory {
  /**
   * Generates a personalized email for Returning customers.
   *
   * @return the email text
   */
  @Override
  public String generateEmail() {
    String email = "This is a Returning Email";
    return email;
  }
}
