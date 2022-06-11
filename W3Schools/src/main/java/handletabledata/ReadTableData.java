package handletabledata;

import base.CommonAPI;

public class ReadTableData {

    public static void readTable(){
        String text = CommonAPI.getWebText(".ws-table-all.notranslate tr:nth-child(5) td:nth-child(4)");
        System.out.println(text);
    }
}
