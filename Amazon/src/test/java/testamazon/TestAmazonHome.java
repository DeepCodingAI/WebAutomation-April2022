package testamazon;

import base.CommonAPI;
import datasource.SearchItems;
import dropdownmenu.SearchDropDownMenu;
import org.testng.annotations.Test;

public class TestAmazonHome extends CommonAPI {

    @Test
    public void testHomePage(){
        SearchItems.searchItems();
    }

    //@Test
    public void testHomePageTitle(){
        String title = driver.getTitle();
        System.out.println(title);
    }

    //@Test
    public void fetchDropDownMenuText(){
        SearchDropDownMenu.fetchDropDownMenuItems();
    }
}
