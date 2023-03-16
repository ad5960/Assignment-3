/**
 * Name: Ayush Dixit
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/16/2023
 * File Name: Main.java
 * Description: Main class that creates instances of each customer type and prints all the types of emails
 */

package com.email.assignment2;

/**
 * Main class that creates instances of each customer type.
 */
public class Main {
  /**
   * Main method that creates instances of each customer type.
   */
  public static void main(String[] args) {
    EmailFactory businessEmailGenerator = EmailFactoryCreator.createEmailFactory("Business");
    String businessEmail = businessEmailGenerator.generateEmail();
    System.out.println(businessEmail);
  
    EmailFactory returningEmailGenerator = EmailFactoryCreator.createEmailFactory("Returning");
    String returningEmail = returningEmailGenerator.generateEmail();
    System.out.println(returningEmail);
  
    EmailFactory frequentEmailGenerator = EmailFactoryCreator.createEmailFactory("Frequent");
    String frequentEmail = frequentEmailGenerator.generateEmail();
    System.out.println(frequentEmail);
  
    EmailFactory newEmailGenerator = EmailFactoryCreator.createEmailFactory("New");
    String newEmail = newEmailGenerator.generateEmail();
    System.out.println(newEmail);
  
    EmailFactory vipEmailGenerator = EmailFactoryCreator.createEmailFactory("VIP");
    String vipEmail = vipEmailGenerator.generateEmail();
    System.out.println(vipEmail);
  }
}

