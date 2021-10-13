package pageObjects;

import org.openqa.selenium.By;

public class ReviewAndBookPage {

    public static String firstName = "Jonhatan";
    public static String lastName = "MCtest";
    public static String phoneNumber = "867234776";

    public static final By USER_FIRST_NAME = By.xpath("//input[@id='CreationName']");
    public static final By USER_LAST_NAME = By.xpath("//input[@id='CreationSurname']");
    public static final By USER_EMAIL = By.xpath("//input[@id='Email']");
    public static final By CONFIRM_EMAIL = By.xpath("//input[@id='ConfirmEmail']");
    public static final By USER_PHONE= By.xpath("//input[@id='Phone']");
    public static final By COMPLETE_RESERVATION_BUTTON = By.xpath("//button[@id='registerBooking']");
    public static final By TERMS_CONDITIONS_WARNING_MESSAGE = By.xpath("//span[contains(text(),'Please accept the terms and conditions')]");
}
