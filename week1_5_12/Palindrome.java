import java.util.Scanner;

public class Palindrome {
    static int PalindromeNumber(int number){
        int sum=0;
        while(number>0){
            int reverse=number%10;
            sum=(sum * 10)  + reverse;
            number /= 10;
        }
        
        return sum;
    }

    public static void main(String[] args){
        Scanner scanObj = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = scanObj.nextInt();
       // int mark = scanObj.nextInt();
        int num=PalindromeNumber(number);
        //System.out.println(num);

        if(num==number){
            System.out.println("The given number is palindrome.");
        } else{
            System.out.println("The given number is not a palindrome.");
        }

        scanObj.close();
    }
    
} 
