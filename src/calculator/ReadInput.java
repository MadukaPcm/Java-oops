package calculator;
import java.util.Scanner;

public class ReadInput {
    public static String main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input expression (for eg: 4*3/2)");
        String inputLine = scanner.nextLine();
        scanner.close();
        return inputLine;
    }
}
