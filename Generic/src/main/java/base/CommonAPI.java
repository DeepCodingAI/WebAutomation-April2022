package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class CommonAPI {
    public WebDriver driver = null;

    @Parameters({"url"})
    @BeforeMethod
    public void launchBrowser(String url){
        System.setProperty("webdriver.chrome.driver", "/Users/matiur/develop/aint/SeleniumAprill2022/SeleniumProject1/src/driver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to(url);
    }

    @AfterMethod
    public void cleanUp(){
        driver.close(); //closing the browser
    }

    //Selenium API
    public void typeOnWebElement(String locator, String value){
        try{
            driver.findElement(By.id(locator)).sendKeys(value, Keys.ENTER);
        }catch (Exception ex1){
            try {
                driver.findElement(By.cssSelector(locator)).sendKeys(value, Keys.ENTER);
            }catch (Exception ex2){
                try{
                    driver.findElement(By.name(locator)).sendKeys(value, Keys.ENTER);
                }catch (Exception ex3){
                    driver.findElement(By.xpath(locator)).sendKeys(value, Keys.ENTER);
                }
            }
        }
    }
}
