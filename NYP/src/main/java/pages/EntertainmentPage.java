package pages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import reporting.TestLogger;

public class EntertainmentPage {
    public WebDriver driver = null;
    public EntertainmentPage(){}

    public EntertainmentPage(WebDriver driver){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.CSS, using = ".story__headline.headline.headline--xl")
    public static WebElement headLineNewsWebElement;

    public String getHeadLineNewsText(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String headLine = headLineNewsWebElement.getText();
        System.out.println(headLine);
        return headLine;
    }
}
