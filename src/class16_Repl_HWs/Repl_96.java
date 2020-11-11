package class16_Repl_HWs;
import java.util.Scanner;

public class Repl_96 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any programming language");
        String language = sc.nextLine();
        String message;

    switch(language.toLowerCase()){
        case "java":
            message= "Java is a programming language";
            break;
        case "c":
            message= "C is a procedural programming language";
            break;
        case"c++":
            message= " C++ is a mid level programming language";
            break;
        default:

            message= " there is no such programming language";

    }
        System.out.println(message);
    }


}
