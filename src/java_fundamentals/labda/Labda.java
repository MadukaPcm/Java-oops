package java_fundamentals.labda;
import java.util.ArrayList;

public class Labda {
public static void main(String[] args){
    ArrayList<Integer> num = new ArrayList<>();

    num.add(45);
    num.add(70);
    num.add(90);
    num.add(9);
    num.forEach((n)-> System.out.println(n));
}
}

