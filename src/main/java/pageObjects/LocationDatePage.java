package pageObjects;

import org.openqa.selenium.By;

public class LocationDatePage {

   public static final By PAGE_HEADER_LABEL = By.xpath("//div[@class='headLabel']");
   public static final By PICKUP_LOCATION = By.xpath("//span[contains(text(),'Enter city, state or airport...')]");
   public static final By SEARCH_LOCATION = By.xpath("//input[@role='textbox']");
   public static final By SELECT_FROM_RESULTS = By.xpath("//li[contains(text(),'SOF, Airport, Sofia, Bulgaria')]");
   public static final By PICKUP_DATE =  By.xpath("//input[@id='PickupDate']");
   public static final By RETURN_DATE =  By.xpath("//input[@id='ReturnDate']");
   public static final By SEARCH_BUTTON = By.xpath("(//button[@type='submit'])[3]");
}
