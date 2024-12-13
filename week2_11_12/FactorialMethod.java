// Write a Java program to create a method `calculateFactorial(int number)
// that accepts an integer as an argument and returns the factorial of the number.
//  Use the method in the `main` method to find the factorial of 5.

public class FactorialMethod {
    static int calculateFactorial(int number){
       int fact=1;
        for(int i=1;i<=number;i++){
        fact=fact*i;
        }
          return fact;
    }
    public static void main(String[] args) {
       // int number;
       int factorial=calculateFactorial(5);
       System.out.println("Factorial of a number 5 is:"+factorial);
    }
}
