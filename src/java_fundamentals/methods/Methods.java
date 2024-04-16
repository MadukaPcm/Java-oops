package java_fundamentals.methods;

public class Methods {
    public static void main(String [] args){
        // Dealing with java methods both built in and user defined.
        String brand = "SUMSUNG";
        System.out.println(brand.toUpperCase().startsWith("N")); // with builtin method.

        char [] letters = {'A','A','B','C','D','D','D'};

        // calling the method.
        int count = countOccurrences(letters,'A');
        System.out.println("Appeared "+count);
    }

    public static int countOccurrences(char [] letters, char searchLetter){  // static means the methods belongs to a class.
        System.out.println("Method was invoked!!");
        int count = 0;
        for (char letter : letters){
            if (letter == searchLetter){
                count ++;
            }
        }
        return count;
    }
}
