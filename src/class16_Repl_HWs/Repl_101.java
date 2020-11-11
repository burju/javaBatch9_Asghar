package class16_Repl_HWs;

import java.util.Scanner;

public class Repl_101 {


    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        //write your code below

//        StringBuilder word_SB=new StringBuilder(word);
//        StringBuilder newWord= new StringBuilder("");
        String newWord="";
        for(int i=0; i<word.length(); i=i+2){

            newWord+= word.charAt(i);

        }
        System.out.println(newWord);
    }
}
