package encapsulation;

// En capsul ation.    Protecting the properties of the class to the outside world and way to access it.

public class Student {

    private String name;
    private int age;
    private String address;

    public Student(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    public void setAddress(String address){
        this.address = address;
    }
    public String getAddress(){
        return address;
    }

    @Override
    public String toString(){
        return ("Student name is "+ this.name + " age is + "+ this.age + " and the address is "+ this.address);
    }
}
