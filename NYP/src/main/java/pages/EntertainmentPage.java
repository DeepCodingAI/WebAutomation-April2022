package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class EntertainmentPage {
    public WebDriver driver = null;
    public EntertainmentPage(){}

    public EntertainmentPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
