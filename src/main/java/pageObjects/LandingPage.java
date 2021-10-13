package pageObjects;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LandingPage {

    public static String baseUrl = "https://www.hertz.bg/en/";

    public static final By CLOSE_POP_UP = By.xpath("//body/div[@id='modalSplit']/div[1]/div[1]/div[1]/button[1]");
    public static final By ACCEPT_COOKIES = By.xpath("//*[@id='onetrust-accept-btn-handler']");
    public static final By LOGIN_SIGNUP_PANEL = By.xpath("//div[@id='dev-login']"); //img[@alt='hertz_logo']
    public static final By HERTZ_LOGO = By.xpath("//img[@alt='hertz_logo']");


    public static void openLandingPage() {
        open(baseUrl);
        $(CLOSE_POP_UP).click();
        $(ACCEPT_COOKIES).click();
        $(LOGIN_SIGNUP_PANEL).shouldBe(visible);
        $(HERTZ_LOGO).shouldBe(visible);
    }
}