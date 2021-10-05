package com.hertz;

import com.codeborne.selenide.SelenideElement;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.security.Key;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import static java.security.Key.*;
import static org.openqa.selenium.Keys.ENTER;
import static org.openqa.selenium.support.ui.Select.*;
import static pageObjects.LandingPage.*;


public class LandingPageTest {

    @Test
    public void userCannotLoginWithoutCredentials() {
        open(baseUrl);
        $(CLOSE_POP_UP).click();
        $(By.xpath("//*[@id='onetrust-accept-btn-handler']")).click();
        $(LOGIN_BUTTON).click();
        $(LOGIN_SUBMIT_BUTTON).click();
        $(EMAIL_REQUIRED_WARNING_MESSAGE).shouldHave(text("The Email field is required."));
        $(PASSWORD_REQUIRED_WARNING_MESSAGE).shouldHave(text("The Password field is required."));

    }

    @Test
    public  void userLoginWithValidCredentials(){
        $(EMAIL_FIELD).sendKeys(user_email);
        $(PASSWORD_FIELD).sendKeys(user_password);
        $(LOGIN_SUBMIT_BUTTON).click();
        $(USER_PROFILE_NAME).shouldBe(visible);

        $(By.xpath("//span[@title='Our Fleet']")).click();
        $(By.xpath("//a[contains(text(),'BOOK NOW')]")).click();
        //sleep(2000);
        $(By.xpath("//span[contains(text(),'Enter city, state or airport...')]")).click();
        $(By.xpath("//input[@role='textbox']")).sendKeys("SOF");
        $(By.xpath("//li[contains(text(),'SOF, Airport, Sofia, Bulgaria')]")).click();
        $(By.xpath("//input[@id='PickupDate']")).sendKeys("14/01/2022");
        $(By.xpath("//input[@id='ReturnDate']")).sendKeys("24/01/2022");
        $(By.xpath("(//button[@type='submit'])[3]")).click();
        $(By.xpath("//button[contains(text(),'TAKE ME TO THE NEXT STEP')]")).scrollTo().click();
        sleep(5000);
    }
}
