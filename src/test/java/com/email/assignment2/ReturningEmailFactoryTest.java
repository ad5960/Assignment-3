package com.email.assignment2;

import junit.framework.TestCase;

public class ReturningEmailFactoryTest extends TestCase {
  
  public void testGenerateEmail() {
    EmailFactory returningEmailGenerator = EmailFactoryCreator.createEmailFactory("Returning");
    String returningEmail = returningEmailGenerator.generateEmail();
    assertEquals("This is a Returning Email",returningEmail);
  }
}