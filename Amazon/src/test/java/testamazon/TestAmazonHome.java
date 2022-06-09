package testamazon;

import base.CommonAPI;
import org.testng.annotations.Test;

public class TestAmazonHome extends CommonAPI {

    @Test
    public void testHomePage(){
        typeOnWebElement("#twotabsearchtextbox","laptop");
    }

    @Test
    public void testHomePageTitle(){
        String title = driver.getTitle();
        System.out.println(title);
    }
}
