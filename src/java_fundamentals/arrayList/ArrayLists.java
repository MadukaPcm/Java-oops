package java_fundamentals.arrayList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayLists {
    public static void main(String[] args){
        ArrayList<String> cars = new ArrayList<>();

        cars.add("BM");
        cars.add("NOMA");
        cars.add("HV");
        Iterator<String> it = cars.iterator();
        System.out.println("IT "+it.hasNext());

        Collections.sort(cars);
        System.out.println(cars);

        for(String car : cars){
            System.out.println(car);
        }
        cars.remove(0);
        System.out.println(cars);
        cars.clear();
        System.out.println(cars);
    }
}
