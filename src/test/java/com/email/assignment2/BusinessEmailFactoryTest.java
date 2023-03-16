package com.email.assignment2;

import junit.framework.TestCase;

public class BusinessEmailFactoryTest extends TestCase {
  
  public void testGenerateEmail() {
    EmailFactory businessEmailGenerator = EmailFactoryCreator.createEmailFactory("Business");
    String businessEmail = businessEmailGenerator.generateEmail();
    assertEquals("This is a Business Email",businessEmail);
  }
}