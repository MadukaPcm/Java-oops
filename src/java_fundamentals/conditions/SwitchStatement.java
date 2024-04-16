package java_fundamentals.conditions;

public class SwitchStatement {

    public static void main(String[] args){
        // switch statement.      || the switch statement is powerfull for simple scenario use if statement.
        String gender = "MAlE";

        switch (gender.toUpperCase()){
            case "FEMALE":
                System.out.println("She is a female");
                break;
            case "MALE":
                System.out.println("He is a male");
                break;
            default:
                System.out.println("Has unknown gender");
        }
    }
}
