package java_fundamentals.packages;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Packages {

    public static void main(String[] args){
        Date date = new Date();
        LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");

        System.out.println(date);
        System.out.println(localDate);
        System.out.println(localDateTime);
        System.out.println(format.format(date));

        // Math class: allowa us to perform extra operation on numbers.
        System.out.println(Math.abs(-20)); // .obs == |x|
        System.out.println(Math.max(30,90));
        System.out.println(Math.min(30,90));
        System.out.println((int)Math.pow(5,2));
        System.out.println((int) Math.sqrt(25));
        System.out.println(Math.PI);


    }


}
