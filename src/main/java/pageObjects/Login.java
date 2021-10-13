package pageObjects;

import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;

public class Login {
    public static String userEmail = "povir43693@oemmeo.com";
    public static String userPassword = "TestQA321";
    public static String invalidEmail = "invalid@test.com";
    public static String invalidPassword = "wrongPass";

    public static final By EMAIL_REQUIRED_WARNING_MESSAGE = By.xpath("//span[contains(text(),'The Email field is required.')]");
    public static final By LOGIN_SUBMIT_BUTTON = By.xpath("//button[@id='login-form-submit']");
    public static final By LOGIN_BUTTON = By.xpath("//span[contains(text(),'Login')]");
    public static final By PASSWORD_REQUIRED_WARNING_MESSAGE = By.xpath("//span[contains(text(),'The Password field is required.')]");
    public static final By EMAIL_FIELD = By.xpath("//input[@id='LoginEmail']");
    public static final By PASSWORD_FIELD = By.xpath("//input[@id='LoginPassword']");
    public static final By USER_PROFILE_NAME = By.xpath("//div[@id='dev-profile-displayName']");
    public static final By INVALID_EMAIL_PASSWORD_MESSAGE = By.xpath("//div[contains(text(),'Email or Password is not valid')]");

   public static void loginWithoutCredentials() {
       $(LOGIN_BUTTON).click();
       $(LOGIN_SUBMIT_BUTTON).click();

   }
  public static void loginWithWrongCredentials(String invalidEmail, String invalidPassword){
      $(EMAIL_FIELD).sendKeys(invalidEmail);
      $(PASSWORD_FIELD).sendKeys(invalidPassword);
      $(LOGIN_SUBMIT_BUTTON).click();
  }

    public static void loginWithValidCredentials(String userEmail , String userPassword) {

        $(EMAIL_FIELD).sendKeys(userEmail);
        $(PASSWORD_FIELD).sendKeys(userPassword);
        $(LOGIN_SUBMIT_BUTTON).click();

    }
}
