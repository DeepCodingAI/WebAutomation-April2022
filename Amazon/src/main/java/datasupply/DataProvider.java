package datasupply;

import java.util.List;

public class DataProvider {

    ConnectionToSqlDB connectToSqlDB = new ConnectionToSqlDB();
    public List<String> getItemListFromDB() throws Exception {
        List<String> list = connectToSqlDB.readDataBase("ItemList","items");

        return list;
    }
}
