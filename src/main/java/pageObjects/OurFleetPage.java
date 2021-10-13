package pageObjects;

import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;

public class OurFleetPage {

    public static final By FILTERS_PANEL = By.xpath("//div[@class='s-fleet__filters']");
    public static final By CARS_LIST = By.xpath("//div[@class='b-vue-results']");
    public static final By BOOK_NOW_BUTTON = By.xpath("(//a[contains(.,'BOOK NOW')])[1]");

}
