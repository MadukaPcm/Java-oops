package java_fundamentals.arrays;

public class WhileLoop {
    public static void main(String[] args){
        // while loop and do while loop.
        int count = 0;
        do{
            System.out.println("Hi "+ count);
            count ++ ;
        }while (count <= 20);

        while(count <= 20){
            System.out.println("Hi");
            count ++ ;
        }
    }
}
