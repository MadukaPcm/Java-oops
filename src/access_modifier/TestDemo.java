package access_modifier;

public class TestDemo {
    Test t = new Test();
    public void display(){
        System.out.println("Testing in the access modifier in the same package");
        t.getAccess();
    }
}

//TestDemo tt = new TestDemo();
//        tt.display();
