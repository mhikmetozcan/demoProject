package com.devPayever.staging.pages;

import com.devPayever.staging.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FashionPage extends BasePage {
@FindBy(xpath = "//div[@class='input-field ng-tns-c134-1 ng-trigger ng-trigger-isFocuesText']")
   public WebElement firstNameMask;
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

JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

public void dataEntrytoInputBox(String fieldName, String fieldValue){

   WebDriverWait wait = new WebDriverWait(Driver.getDriver(),20);

   switch (fieldName){
      case "firstName":
         js.executeScript("arguments[0].setAttribute('style', 'height: 0px')", firstNameMask);
         firstName.sendKeys(fieldValue);
         break;
      case "lastName":
         lastName.sendKeys(fieldValue);
         break;
      case "email":
         email.sendKeys(fieldValue);
         break;
      case "password":
         password.sendKeys(fieldValue);
         break;
      case "password confirmation":
         confirmPass.sendKeys(fieldValue);
         break;
   }

}
}
