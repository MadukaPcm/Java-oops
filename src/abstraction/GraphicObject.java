package abstraction;

// Hiding data: A class can't be instantiated but can be sublassed. An abstract method is the one declared without
// implementation and every abstract class should atleast have a method.

//Abstraction hides implementation details and shows only essential features of an object. It's achieved using abstract classes and methods, allowing for both abstract and concrete methods. Abstract classes support inheritance and are suitable for providing a common base class with shared functionality among subclasses.
//Interface defines a contract for classes, containing only method signatures without implementations. Classes implement interfaces by providing concrete implementations for all methods declared in the interface. Interfaces support multiple inheritance and are suitable for enforcing common behavior across unrelated classes.

public abstract class GraphicObject {
     int x,y;

     void moveTo(int newX, int newY){
         System.out.println("Move to x :"+ x + " and y:"+ y);
     }

     abstract void draw();
     abstract void resize();
}
