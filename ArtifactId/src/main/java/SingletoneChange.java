import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

/**
 * Created by Admin on 21.06.2017.
 */
public class SingletoneChange {

    Singletone X;



    @DataProvider(name = "dataChange")
    public Object[][] simpleDataProvider() {
        return new Object[][]{
                {1,"test"},
                {10,"test"},
                {20,"test"}
        };
    }
    @BeforeClass
    public void xPopulate() {

        X = Singletone.getInstance();

        X.populate();

    }


    @Test(dataProvider = "dataChange")
    public void testChange(int firstPar, String secondPar){

        X.change(firstPar, secondPar);

        assertTrue(X.getValue(firstPar).equals("test"));

    }

}


