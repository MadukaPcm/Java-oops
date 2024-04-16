package java_fundamentals.variables;

import java.time.LocalDate;

public class NonPrimitive {
    // Non primitive data types:
    //Orimitive data types are basic data types provided by the language, while non-primitive data types are user-defined
    public static void main(String[] args){
        String name = new String("Maduka");
        System.out.println(name.toUpperCase());
        LocalDate now = LocalDate.now();
        System.out.println(now.getDayOfWeek());

        String waz = "Frank";
        System.out.println(waz);
        System.out.println(waz.toUpperCase());
        System.out.println(waz.contains(name));
        System.out.println(waz.equals(name));
        System.out.println(waz.startsWith("F"));
    }

}
