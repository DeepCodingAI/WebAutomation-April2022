package datasource;

import base.CommonAPI;
import reporting.TestLogger;

import java.util.List;

public class DataProvider {

    ConnectionToSqlDB connectToSqlDB = new ConnectionToSqlDB();
    public List<String> getItemListFromDB() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        List<String> list = connectToSqlDB.readDataBase("ItemList","items");

        return list;
    }
}
