import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Admin on 20.06.2017.
 */
public class Singletone {


    private ArrayList<String> array;

    private static Singletone instance;



    private Singletone(){}

    public static synchronized Singletone getInstance(){
        if(instance == null){
            instance = new Singletone();
        }
        return instance;
    }


    public synchronized void populate(){
        if(array == null) {
            array = new ArrayList<String>();
            final Random random = new Random();
            for (int i = 0; i < 100; i++) {
                int r = random.nextInt(2);
                if (r == 0) {
                    array.add("Fail");
                } else if (r == 1) {
                    array.add("Pass");
                }
            }

        }
    }

    public String get(){
        int size = array.size();
        Random random = new Random();
        return array.get(random.nextInt(size));
    }

    public synchronized void change(int index, String value){
        array.set(index, value);
    }

    public String getValue(int index){
        return array.get(index);
    }
}
