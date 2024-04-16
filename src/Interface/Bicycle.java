package Interface;
//Abstraction hides implementation details and shows only essential features of an object. It's achieved using abstract classes and methods, allowing for both abstract and concrete methods. Abstract classes support inheritance and are suitable for providing a common base class with shared functionality among subclasses.
//Interface defines a contract for classes, containing only method signatures without implementations. Classes implement interfaces by providing concrete implementations for all methods declared in the interface. Interfaces support multiple inheritance and are suitable for enforcing common behavior across unrelated classes.

public interface Bicycle {

    void applyBrake(int decrement);

    void speedUp(int increment0);
}
