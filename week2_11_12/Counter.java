// Create a class `Counter` with a static variable `count`.
//  Increment the count every time a new object of the class is created.
//  In the `main` method, create three objects of `Counter` and display the value of `count`.

public class Counter {
     static int count=0;

    public Counter(){
        count++;
   }
   public static int getCount(){
        return count;
   }
    public static void main(String[] args) {
        Counter Count1=new Counter();
        Counter Count2=new Counter();
        Counter Count3=new Counter();
   System.out.println("Count: "+ Counter.getCount());
    }
}
