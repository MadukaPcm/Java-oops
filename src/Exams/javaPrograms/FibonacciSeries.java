package Exams.javaPrograms;

import java.util.Scanner;

public class FibonacciSeries {
    // sume of the next == sum of the first two items: fn = fn-1 + fn-2;
   public static void main(String[] args){
       int n, a = 0, b = 0, c = 1;
       System.out.println("Enter the n~value:");
       Scanner input = new Scanner(System.in);
       n = input.nextInt();
       for(int i = 0; i <= n; i++){
           a = b;
           b = c;
           c = a + b;
           System.out.println(a +" ");
       }
   }

}
