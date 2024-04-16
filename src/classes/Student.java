package classes;

public class Student {
    String name;
    int age;
    String address;

    public Student(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void setName(String name){
        this.name = name;    //this.    refers current object.
    }
    public String getName() {
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAddress(String address){
        this.address = address;
    }
    public String getAddress(){
        return address;
    }

    public String toString(){
        return  ("Student name is "+ this.getName()+", age is: "+ this.getAge()+" and address is: "+ this.getAddress());
    }

//    public static void main(String[] args){
//        Student maduka = new Student("Maduka",23,"madukapcm@gmail.com");
//        System.out.println(maduka.getName());
//        System.out.println(maduka.toString());
//        System.out.println(maduka.getAddress());
//    }
}