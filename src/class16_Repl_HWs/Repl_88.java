package class16_Repl_HWs;
/*
Create a Class Main
In this class, you should specify the following attributes: breed, name, color, and following behaviors: bark(), run(), play().
Create 3 different objects of it: Husky, Bulldog, Labrador with specific attributes and behaviors.

The output of the program should be as following:

Husky can bark
Husky can run
Husky can play
Bulldog can bark
Bulldog can run
Bulldog can play
Labrador can bark
Labrador can run
Labrador can play
 */

public class Repl_88 {
    public static void main(String[] args) {
        String s1="hello world";
        String s2="";


        System.out.println(s1.isEmpty());
        System.out.println(s2.isEmpty());
        System.out.println(s1.endsWith("o") +" index of h: "+ s1.indexOf('h') + "index of 'hello'"+ s1.indexOf("world"));

        String given= "I love Java classes at Syntax";
        String[] tokens= given.split(" ");
        for (int i = 3; i <=5 ; i++) {
            System.out.print(tokens[i]+" ");
        }
        System.out.println();
        for (int i = 0; i <4 ; i++) {
            System.out.print(tokens[i]+" ");
        }

    }
}
