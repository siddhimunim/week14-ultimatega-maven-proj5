package com.ultimatega.courses.testsuite;

import com.ultimatega.courses.pages.MainPage;
import com.ultimatega.courses.pages.SignInPage;
import com.ultimatega.courses.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignInTest extends BaseTest {
    MainPage mainPage = new MainPage();
    SignInPage signInPage = new SignInPage();

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() throws InterruptedException{
        Thread.sleep(1000);
        mainPage.clickOnSignin();
        String expText ="Welcome Back!";
        String actText = signInPage.verifyTextField();
        Assert.assertEquals(actText,expText,"Not varify");

    }
    @Test
    public void  verifyTheErrorMessage() throws InterruptedException {
        Thread.sleep(1000);
        mainPage.clickOnSignin();
        signInPage.clickOnEmail("abcd@gamil.com");
        signInPage.clickOnPassword("abcd1234");
        Thread.sleep(1000);
        signInPage.clickOnSignButton();
        String expText ="Invalid email or password.";
        String actText = signInPage.verifyInvalidField();
        Assert.assertEquals(actText,expText,"Not varify");


    }
}
