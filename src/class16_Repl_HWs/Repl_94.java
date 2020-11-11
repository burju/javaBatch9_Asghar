package class16_Repl_HWs;

public class Repl_94 {


    public static void main(String[] args) {
        String given= "I love Java classes at Syntax";
        String[] tokens= given.split(" ");
        String s1="";
        String s2="";
        for (int i = 3; i <=5 ; i++) {
            s1=  s1+" "+ tokens[i];
        }
        for (int i = 0; i <3 ; i++) {

            s2 = s2+ " "+ tokens[i];
        }
        System.out.println(s1.trim());
        System.out.println(s2.trim());

    }
}
//// ikinci cozum:
//public static void main(String[] args) {
//
//    String given = "I love Java classes at Syntax";
//    String substr=given.substring(12);
//    System.out.println(substr);
//
//    substr=given.substring(0, 11);
//    System.out.println(substr);
//
//}