import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;


/**
 * Created by Admin on 21.06.2017.
 */
public class SingletoneGet {


    Singletone X ;


    @BeforeClass
    public void xPopulate(){

        X = Singletone.getInstance();

        X.populate();
    }

    @Test
    public void testGet(){
        String str = X.get();
        assertTrue(str.substring(1).equals("ass"), "Строка " + str + " не содержит подстроку 'ass'");
    }
}

