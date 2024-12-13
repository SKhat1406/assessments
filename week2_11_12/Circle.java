// Write a program to define a class `Circle` with an attribute `radius`. 
// Include a class method `calculateCircumference()` that returns the circumference of the circle. Test the method with a circle of radius 7.

public class Circle {
    int radius;

    public double calculateCircumference(int radius){
       final double pi=3.1415;
       double circumference= 2 * pi * radius;
       return circumference;
    }

    public static void main(String[] args) {
        int Test=7;
       Circle circumCircle=new Circle();
       
       System.out.println("Circumference of circle is:"+circumCircle.calculateCircumference(Test));
    }
}
