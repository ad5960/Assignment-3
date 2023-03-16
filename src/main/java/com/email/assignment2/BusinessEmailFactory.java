package com.email.assignment2;

/**
 * Concrete EmailFactory class that generates personalized emails for Business customers.
 */
public class BusinessEmailFactory implements EmailFactory {
  /**
   * Generates a personalized email for Business customers.
   *
   * @return the email text
   */
  @Override
  public String generateEmail() {
    String email = "This is a Business Email";
    return email;
  }
}
