package testamazon;

import base.CommonAPI;
import datasupply.SearchItems;
import dropdownmenu.SearchDropDownMenu;
import org.testng.annotations.Test;

public class TestAmazonHome extends CommonAPI {

    @Test
    public void testHomePage() throws Exception {
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
