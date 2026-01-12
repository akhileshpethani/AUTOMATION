package Assignment_6;
abstract class Parent {
    abstract void message(); // Abstract method
}

// First subclass
class FirstSubclass extends Parent {
    @Override
    void message() {
        System.out.println("This is first subclass");
    }
}

// Second subclass
class SecondSubclass extends Parent {
    @Override
    void message() {
        System.out.println("This is second subclass");
    }
}
public class P024_AbstractClass {
	 public static void main(String[] args) {
	        // Create object of first subclass
	        Parent obj1 = new FirstSubclass();
	        obj1.message(); // Calls FirstSubclass method

	        // Create object of second subclass
	        Parent obj2 = new SecondSubclass();
	        obj2.message(); // Calls SecondSubclass method
	    }
	

}
