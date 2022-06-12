package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BusinessPage {
    public WebDriver driver = null;
    public BusinessPage(){}
    public BusinessPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
