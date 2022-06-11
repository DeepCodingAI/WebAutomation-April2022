package datasource;

import base.CommonAPI;

import java.util.ArrayList;
import java.util.List;

public class SearchItems {

    public static void searchItems(){
        List<String> list = getItemList();
        for(int i=0; i<list.size(); i++) {
            CommonAPI.typeOnWebElementNHitEnter("#twotabsearchtextbox", list.get(i));
            CommonAPI.clearInputBox("#twotabsearchtextbox");
        }
    }

    //implement database access to read items list
    //fetch api to collect items list
    public static List<String> getItemList(){
        List<String> list = new ArrayList<>();
        list.add("iPhone");
        list.add("honey");
        list.add("coffee mug");
        list.add("headphone");
        list.add("TV");

        return list;

    }
}
