package java_fundamentals.conditions;

public class IfStatement {
    public static void main(String[] args){
        int age = 16;

        // Using ternary operator. if have onie condition to check.
        String message = age >= 18 ? "Am an adult" : "Am not an adult";
        System.out.println(message);

        // using if statement.
        if (age >= 18){
            System.out.println("Heee am an adult");
        } else if (age >= 16 && age < 18) {
            System.out.println("Am almost an adult");
        } else {
            System.out.println("Am not an adult");
        }
    }
}
