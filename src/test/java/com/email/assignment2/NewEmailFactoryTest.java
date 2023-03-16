package com.email.assignment2;

import junit.framework.TestCase;

public class NewEmailFactoryTest extends TestCase {
  
  public void testGenerateEmail() {
    EmailFactory newEmailGenerator = EmailFactoryCreator.createEmailFactory("New");
    String newEmail = newEmailGenerator.generateEmail();
    assertEquals("This is a New Email",newEmail);
  }
}