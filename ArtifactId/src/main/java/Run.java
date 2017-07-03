/**
 * Created by Admin on 30.06.2017.
 */
public class Run {

    public void main(String[] args) {




        SingletoneGet get = new SingletoneGet();
        get.xPopulate();
        get.testGet();




        SingletoneChange change = new SingletoneChange();
        change.xPopulate();
        change.testChange(10,"test");
    }

}
