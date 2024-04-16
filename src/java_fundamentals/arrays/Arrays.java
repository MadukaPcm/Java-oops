package java_fundamentals.arrays;

public class Arrays {
    public static void main(String[] args){
        // Arrays
        int [] number = {20,30,5,89,100};
        String [] names = {"Bro", "Frank", "Maduka", "Kessi", "MadukaPcm"};

        int [] numbers = new int[3];
        numbers[0]  = 0;
        numbers[1] = 1;
        numbers[2] = 2;
        for (int i = 0; i < number.length; i++){
            System.out.println(number[i]);
        }
        System.out.println(number.length);
        System.out.println(java.util.Arrays.stream(names).count() );

        int num = 0;
        num = num + 2;
        System.out.println(num);

        // enhanced for~loop.   do not provide access to actual index.
        System.out.println("Enhanced for loop");
        for (int nm : number){
            System.out.println(nm);
        }
        //umber.for    new techinique.. for getting for loop.
        String [] nam = {"Maduka", "Nom", "From", "Kutoka","Noma"};
        for(String name : nam){
            if (name.equals("Noma")){
                break;
            }
            System.out.println(name);

            if(name.startsWith("F")){
                continue;
            }
            System.out.println(name);
        }

    }
}
