package com.email.assignment2;

import junit.framework.TestCase;

public class FrequentEmailFactoryTest extends TestCase {
  
  public void testGenerateEmail() {
    EmailFactory frequentEmailGenerator = EmailFactoryCreator.createEmailFactory("Frequent");
    String frequentEmail = frequentEmailGenerator.generateEmail();
    assertEquals("This is a Frequent Email",frequentEmail);
  }
}