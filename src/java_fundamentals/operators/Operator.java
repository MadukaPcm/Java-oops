package java_fundamentals.operators;

public class Operator {

    public static void main(String[] args){
        // Logical operator.
        int madukaAge = 26;
        int estherAge = 20;

        System.out.println(madukaAge > estherAge);
        System.out.println(madukaAge >= estherAge);
        System.out.println(madukaAge < estherAge);
        System.out.println(madukaAge <= estherAge);
        System.out.println(madukaAge == estherAge);
        System.out.println(madukaAge != estherAge);

        boolean isAdult = false;
        boolean isStudent = true;
        boolean isEMadukaMember = true;
        System.out.println(isAdult && isStudent);
        System.out.println(isAdult || isStudent);
        System.out.println((isAdult || isStudent) && isEMadukaMember);
        System.out.println((!isAdult || isStudent) && isEMadukaMember);   // fliping the value.
        System.out.println(isAdult == true);
        String name = "Maduka";
        System.out.println("Complex logical comparison operator");
        System.out.println(20 > 2 || 30<70 && isStudent && name.contains("M"));
    }
}
