package class15.Methods;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

/*
Create a String and if the String is not empty perform the following:
if the String has an odd number of characters and has 3 or more characters, print the character in the middle of the String.
Create a String and print it in reverse order (Sunday → yadnuS).
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("please enter a word");
        String word= input.nextLine();
        if(word.length()>3 && word.length()%2==1){
            System.out.println("printing the charachter in the middle:");
            System.out.println(word.charAt(word.length()/2));
        }
        else {
            System.out.println("please enter 3 charachters or more, line cannot be empty");
        }
        String reverse="";
        for (int i=word.length()-1; i>=0 ; i--) {
           reverse+= word.charAt(i);
        }
        System.out.println("the reverse of the word is:" + reverse);
    }
}
