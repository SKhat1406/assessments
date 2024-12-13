//Write a method `isPalindrome(String str)` that checks whether the given string is a palindrome. Test the method with the word `"radar"`.

public class PalindromeMethod {
             static String isPalindrome(String str){
                String reverseStr="";
                int strLength = str.length();

                for (int i = strLength - 1; i >=0; --i) {
                  reverseStr = reverseStr + str.charAt(i);     //The charAt() method accesses each character of the string
                }   
                  return reverseStr;  
                  
                }
            
       public static void main(String[] args){
        String str ="radar";
       String palindromeString=isPalindrome(str);
       //isPalindrome(str);
         if(str.equals(palindromeString)){                  //equals() method used for check both strings are equal are not.
            System.out.println("The given String is palindrome.");
        } else{
            System.out.println("The given String is not a palindrome.");
        }

     
    }
 }
    