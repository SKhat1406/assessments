 class Vehicle{
    String brand;
    double speed;
    Vehicle(String brand,double speed){
        this.brand =brand;
        this.speed =speed;
    }
    void displayinfo(){
            System.out.println(brand +"it is the car brand and "+speed+" this the highest limit");
        }
}
class Car extends Vehicle{
    String fueltype;
    Car(String brand, double speed, String fueltype) {
        super(brand, speed);
        this.fueltype = fueltype;
    }
    void displaycarinfo(){
        displayinfo();
        System.out.println("This FuelType "+fueltype);
    }
}
public class A{
    public static void main(String[] args){
        Car c =new Car("AUDI",180.0, "Petrol");
        c.displaycarinfo();
    }
} 
