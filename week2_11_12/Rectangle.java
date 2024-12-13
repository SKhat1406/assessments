// Write a program that defines a class `Rectangle` with attributes `length` and `width`.
// Include a method `calculateArea()` that returns the area of the rectangle. 
//In the `main` method, create an object of the class, assign values to its attributes, and display its area.


  class Rectangle{
    int length,width;

    public int calculateArea(){
        int area=length*width;
        return area;
    }
    public static void main(String[] args) {
        Rectangle Area=new Rectangle();
        Area.length=7;
        Area.width=6;
        System.out.println(Area.calculateArea());
    }
}
