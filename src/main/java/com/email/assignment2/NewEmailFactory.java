package com.email.assignment2;

/**
 * Concrete EmailFactory class that generates personalized emails for New customers.
 */
public class NewEmailFactory implements EmailFactory {
  /**
   * Generates a personalized email for New customers.
   *
   * @return the email text
   */
  @Override
  public String generateEmail() {
    String email = "This is a New Email";
    return email;
  }
}
