package com.hertz;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import pageObjects.Login;


import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static pageObjects.HomePage.*;
import static pageObjects.LandingPage.*;
import static pageObjects.Login.*;
import static pageObjects.OurFleetPage.*;
import static pageObjects.LocationDatePage.*;
import static pageObjects.ChooseExtrasPage.*;
import static pageObjects.ReviewAndBookPage.*;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class QuickSmokeTest {

    @Test
    @Order(1)
    public void openLandingPage() {
        open(baseUrl);
        $(CLOSE_POP_UP).click();
        $(ACCEPT_COOKIES).click();
        $(LOGIN_SIGNUP_PANEL).shouldBe(visible);
        $(HERTZ_LOGO).shouldBe(visible);
    }

    @Test
    @Order(2)

    public void userLogin() {
        $(LOGIN_BUTTON).click();
        Login.loginWithValidCredentials(userEmail, userPassword);
        $(USER_PROFILE_NAME).shouldBe(visible);
    }

    @Test
    @Order(3)
    public void navigateToFleetPage() {
        $(OUR_FLEET_BUTTON).click();
        $(FILTERS_PANEL).shouldBe(visible);
        $(CARS_LIST).shouldBe(visible);

        //select first car from the list
        $(BOOK_NOW_BUTTON).click();

    }

    @Test
    @Order(4)
    public void locationDatePage() {
        $(PAGE_HEADER_LABEL).should(text("Make your reservation"));
        $(PICKUP_LOCATION).click();
        $(SEARCH_LOCATION).sendKeys("SOF");
        $(SELECT_FROM_RESULTS).click();
        $(PICKUP_DATE).sendKeys("01/01/2022");
        $(RETURN_DATE).sendKeys("09/01/2022");
        $(SEARCH_BUTTON).scrollTo().click();
    }

    @Test
    @Order(5)
    public void chooseExtrasPage() {
        //add assertions
        $(NEXT_STEP_BUTTON).scrollTo().click();
    }

    @Test
    @Order(6)
    public void reviewAndBookPage() {
        $(USER_FIRST_NAME).clear();
        $(USER_FIRST_NAME).sendKeys(firstName);
        $(USER_LAST_NAME).clear();
        $(USER_LAST_NAME).sendKeys(lastName);
        $(USER_PHONE).sendKeys(phoneNumber);
        $(COMPLETE_RESERVATION_BUTTON).click();
        $(TERMS_CONDITIONS_WARNING_MESSAGE).shouldBe(visible);
    }
}
