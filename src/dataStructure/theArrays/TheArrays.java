package dataStructure.theArrays;

import java.util.Arrays;

public class TheArrays {
    public static void main(String[] args) {
        String[] colors = new String[5];
        colors[0] = "purple";
        colors[1] = "blue";
        System.out.println(colors[0]);
        System.out.println(colors[1]);

        int [] numbers = new int[2];
        numbers[0] = 2;
        numbers[1] = 5;
        System.out.println(numbers[1]);

        for(int num : numbers){
            System.out.println(num);
        }

//        Arrays.stream()
    }
}