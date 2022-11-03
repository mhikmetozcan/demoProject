package com.devPayever.staging.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FashionPage extends BasePage {

@FindBy(xpath = "//input[@formcontrolname='firstName']")
   public WebElement firstName;
@FindBy(xpath = "//input[@formcontrolname='lastName']")
   public WebElement lastName;
@FindBy(xpath = "//input[@type='email']")
   public WebElement email;
@FindBy(xpath = "//input[@formcontrolname='password']")
   public WebElement password;
@FindBy(xpath = "//input[@formcontrolname='confirmPass']")
   public WebElement confirmPass;
@FindBy(xpath = "//button[@class='signup-button']")
   public WebElement signUp;

public void dataEntrytoInputBox(String fieldName, String fieldValue){
   switch (fieldName){
      case "firstName":
         firstName.sendKeys(fieldValue);
         break;
   }

}
}
