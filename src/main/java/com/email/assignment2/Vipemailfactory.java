package com.email.assignment2;

/**
 * Concrete EmailFactory class that generates personalized emails for VIP customers.
 */
public class Vipemailfactory implements EmailFactory {
  /**
   * Generates a personalized email for VIP customers.
   *
   * @return the email text
   */
  @Override
  public String generateEmail() {
    String email = "This is a VIP Email";
    return email;
  }
}
