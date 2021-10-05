package pageObjects;

import org.openqa.selenium.By;

public class LandingPage {

    public static String baseUrl = "https://www.hertz.bg/en/";
    public static String user_email = "povir43693@oemmeo.com";
    public static String user_password = "TestQA321";

    public static final By CLOSE_POP_UP = By.xpath("//body/div[@id='modalSplit']/div[1]/div[1]/div[1]/button[1]");
    public static final By EMAIL_REQUIRED_WARNING_MESSAGE = By.xpath("//span[contains(text(),'The Email field is required.')]");
    public static final By LOGIN_SUBMIT_BUTTON = By.xpath("//button[@id='login-form-submit']");
    public static final By LOGIN_BUTTON = By.xpath("//span[contains(text(),'Login')]");
    public static final By PASSWORD_REQUIRED_WARNING_MESSAGE = By.xpath("//span[contains(text(),'The Password field is required.')]");
    public static final By EMAIL_FIELD = By.xpath("//input[@id='LoginEmail']");
    public static final By PASSWORD_FIELD = By.xpath("//input[@id='LoginPassword']");
    public static final By USER_PROFILE_NAME = By.xpath("//div[@id='dev-profile-displayName']");

}
