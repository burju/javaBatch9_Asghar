package class16_Repl_HWs;

import java.util.Scanner;

public class Repl_105 {


    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        //write your code below


        String newWord= word.replaceAll("[^AaeEiIOoUu]", "");
        System.out.println(newWord);



    }
}





