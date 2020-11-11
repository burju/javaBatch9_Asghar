package class15.Methods;

import java.util.Arrays;

/*
How would you reverse a String character by character?
How would you reverse a String word by word?
How would you check if String is palindrome or not?
How would you swap  2 strings without a temporary variable?
 */
public class Tasks1_4 {
    public static void main(String[] args) {
        //TASK 1: How would you reverse a String character by character?
        System.out.println("TASK 1");
        String sentence = "This is my sentence3";

        System.out.println(new StringBuilder(sentence).reverse().toString());
        String reverse_sentence="";
        System.out.println("the second solution:");
        for (int i = sentence.length()-1; i>0 ; i--) {
            reverse_sentence+=sentence.charAt(i);
        }
        System.out.println(reverse_sentence);


        // TASK 2: How would you reverse a String word by word?
        System.out.println("TASK 2");
        String[] split_sentence = sentence.split(" ");
        System.out.println(Arrays.toString(split_sentence)); // we can either use loop or this method.

        String reversed_sentence = "";
        for (int i = (split_sentence.length - 1); i >= 0; i--) {
            reversed_sentence += (split_sentence[i] + " ");
        }
        System.out.println(reversed_sentence);

        //How would you check if String is palindrome or not?
        System.out.println("TASK 3");
        boolean isPalindrome = true;
        String sentence3 = "ey edip adanada pide ye";
        for (int i = (sentence3.length() - 1), j = 0; i <=j ; i--, j++) {
            if (sentence3.charAt(i) != sentence3.charAt(j)) {
                isPalindrome = false;
                break;
            }}

            if (isPalindrome) {
                System.out.println("the sentence is a palindrome");
            } else {
                System.out.println("the sentence is not a palindrome");

            }
        }}