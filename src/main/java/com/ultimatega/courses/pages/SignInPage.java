package com.ultimatega.courses.pages;

import com.ultimatega.courses.utility.Utility;
import org.openqa.selenium.By;

public class SignInPage extends Utility {

    By welcomeBackText = By.xpath("//h2[contains(text(),'Welcome Back!')]");
    By emailField = By.id("user[email]");
    By passwordField  = By.id("user[password]");
    By signInField = By.xpath("//button[contains(text(),'Sign in')]");
    By invalidField = By.xpath("//li[contains(text(),'Invalid email or password.')]");


    public String verifyTextField(){
        return getTextFromElement(welcomeBackText);
    }
    public void clickOnEmail(String email){
        sendTextToElement(emailField,email);
    }
    public void clickOnPassword(String password){
        sendTextToElement(passwordField,password);
    }
    public void clickOnSignButton(){
        clickOnElement(signInField);
    }
    public String verifyInvalidField(){
        return getTextFromElement(invalidField);
    }

}
