package testamazon;

import base.CommonAPI;
import datasource.SearchItems;
import dropdownmenu.SearchDropDownMenu;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestAmazonHome extends CommonAPI {

    SearchDropDownMenu searchDropDownMenu = new SearchDropDownMenu();
    SearchItems searchItems = new SearchItems();

    @Test
    public void testHomePage() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchItems.searchItems();
    }

    @Test
    public void fetchDropDownMenuText(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchDropDownMenu.fetchDropDownMenuItems();
    }
}
