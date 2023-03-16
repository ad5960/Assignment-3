package com.email.assignment2;

/**
 * EmailFactory interface that defines the method for generating personalized emails
 * for different customer types.
 */
public interface EmailFactory {
  /**
   * Generates a personalized email for a specific customer type.
   *
   * @return the email text
   */
  public String generateEmail();
}

