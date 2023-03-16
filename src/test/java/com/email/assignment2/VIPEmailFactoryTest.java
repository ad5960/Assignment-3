package com.email.assignment2;

import junit.framework.TestCase;

public class VIPEmailFactoryTest extends TestCase {
  
  public void testGenerateEmail() {
    EmailFactory vipEmailGenerator = EmailFactoryCreator.createEmailFactory("VIP");
    String vipEmail = vipEmailGenerator.generateEmail();
    assertEquals("This is a VIP Email",vipEmail);
  }
}