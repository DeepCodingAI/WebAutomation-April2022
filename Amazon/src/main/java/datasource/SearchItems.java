package datasource;

import base.CommonAPI;

import java.util.List;

import static base.CommonAPI.clearInputBox;

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
