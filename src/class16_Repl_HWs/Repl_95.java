package class16_Repl_HWs;
import java.util.Scanner;
public class Repl_95 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //System.out.println("please enter a string input");
        String sentence = input.nextLine();


        System.out.println("the first 3 letters of " + sentence + " is " + sentence.substring(0, 3));


    }

}
