package class16_Repl_HWs;
import javax.sound.midi.Soundbank;
import java.util.Scanner;
public class Repl_104 {


        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            String[] arr = new String[5];
            //leave above alone!  write your code below

            System.out.println("please enter 5 names each longer than 3 charachters");
            for (int i = 0; i < arr.length; i++) {
                arr[i]= input.nextLine();

                   if(arr[i].length()< 3 ){
                    System.out.println("The names must be longer than 3 charachters");
                    break;
                }}

                for(int j=0; j<5; j++){

                        System.out.println( arr[j].substring(0,3));
                    }
                }
            }





