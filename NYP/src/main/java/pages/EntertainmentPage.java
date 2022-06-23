package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class EntertainmentPage {
    public WebDriver driver = null;
    public EntertainmentPage(){}

    public EntertainmentPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.CSS, using = ".story__headline.headline.headline--xl")
    public static WebElement headLineNewsWebElement;

    public String getHeadLineNewsText(){
        String headLine = headLineNewsWebElement.getText();
        System.out.println(headLine);
        return headLine;
    }
}
