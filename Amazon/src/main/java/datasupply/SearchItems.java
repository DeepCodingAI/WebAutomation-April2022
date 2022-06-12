package datasupply;

import base.CommonAPI;

import java.util.ArrayList;
import java.util.List;

import static base.CommonAPI.clearInputBox;
import static base.CommonAPI.typeOnWebElement;

public class SearchItems {

    public static void searchItems() throws Exception {
        DataProvider dataProvider = new DataProvider();
        List<String> list = dataProvider.getItemListFromDB();
        for(int i=0; i<list.size(); i++) {
            CommonAPI.typeOnWebElementNHitEnter("#twotabsearchtextbox", list.get(i));
            clearInputBox("#twotabsearchtextbox");
        }
    }
}
