package table;

import base.CommonAPI;
import handletabledata.ReadTableData;
import org.testng.annotations.Test;

public class TestTable extends CommonAPI {

    @Test
    public void readTableText(){
        ReadTableData.readTable();
    }
}
