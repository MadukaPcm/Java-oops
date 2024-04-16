package java_fundamentals.scanner;

import java.time.LocalDate;
import java.util.Scanner;

public class Scaner {
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);
        System.out.println("What is your name ?");
        String name = input.nextLine();
        System.out.println("Hello " + name);
        System.out.println("How old are you");
        int age = input.nextInt();
        int year = LocalDate.now().minusYears(age).getYear();
        System.out.println("You were are born in: "+ year);
        if(age < 18){
            System.out.println("Your not an adult");
        }else {
            System.out.println("You are an adult");
        }
    }
}
