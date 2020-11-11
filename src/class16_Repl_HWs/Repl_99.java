package class16_Repl_HWs;

import java.util.Scanner;

/*
Write code that will take in a String input and check to see if it is a palindrome or not.

A palindrome means that the characters are the same forwards and backwards, ignoring spaces.
 */
public class Repl_99 {
            public static void main(String[] args) {
                Scanner inp = new Scanner(System.in);
                System.out.print("In:");
                String givenString = inp.nextLine();
                //write your code below

                if (isPalindrome(givenString)) {
                    System.out.println("the input " + givenString + " is a palindrome");
                } else {
                    System.out.println("the input" + givenString + "is not a palindrome");

                }
            }
    private static boolean isPalindrome(String givenString) {
                String s1= givenString;
                s1= s1.replaceAll(" ", "");
                String s2= reverse(s1);
                return s1.equalsIgnoreCase(s2);

    }

    private static String reverse(String s1){

                StringBuilder sb= new StringBuilder(s1);
                sb.reverse();
                return sb.toString();
    }


}

