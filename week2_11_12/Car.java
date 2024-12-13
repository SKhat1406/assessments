// Define a class `Car` with the following attributes:
// - `brand` (String)
// - `model` (String)
// - `year` (int)

// Use both instance and static variables. Create multiple objects to demonstrate how the static variable is shared across all instances.

public class Car {
    String brand="BMW";
    String model="S series";
    int year=2021;
    
    public static void main(String[] args) {
        Car details = new Car();
        System.out.println("The Car Details:"+details.brand+" "+details.model+" "+details.year);//
    }
}
