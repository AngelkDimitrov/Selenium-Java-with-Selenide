package com.hertz;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.openqa.selenium.By;
import pageObjects.LandingPage;
import pageObjects.Login;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static pageObjects.Login.*;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class LoginTest {

    @Test
    @Order(1)
    public void userDoNotEnterAnyCredentials() {
        LandingPage.openLandingPage();
        Login.loginWithoutCredentials();
        $(EMAIL_REQUIRED_WARNING_MESSAGE).shouldBe(visible);
        $(PASSWORD_REQUIRED_WARNING_MESSAGE).shouldBe(visible);
    }

    @Test
    @Order(2)
    public void userEnterWrongCredentials() {
        Login.loginWithWrongCredentials(invalidEmail, invalidPassword);
        $(INVALID_EMAIL_PASSWORD_MESSAGE).shouldBe(visible);
        $(EMAIL_REQUIRED_WARNING_MESSAGE).shouldNotBe(visible);
        $(PASSWORD_REQUIRED_WARNING_MESSAGE).shouldNotBe(visible);
    }

    @Test
    @Order(3)
    public void userEnterValidCredentials() {
        $(EMAIL_FIELD).clear();
        $(PASSWORD_FIELD).clear();
        Login.loginWithValidCredentials(userEmail, userPassword);
        $(USER_PROFILE_NAME).shouldBe(visible);
    }
}
