package class15.Methods;

import java.util.Scanner;

/*
Write a program that reads two people's first
	names and if they expecting boy or girl?
Based on the input suggests a name for a baby:
Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? boy
Suggested baby name: DANRY
Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? girl
Suggested baby name: MAIEL
 */
public class TASK {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("what is the name of the mom");
        String momName= input.nextLine();
        System.out.println("what is the name of the dad");
        String dadName= input.nextLine();
        System.out.println("are you expecting a boy a girl");
        String gender= input.nextLine();

        String babyName1="";
        String babyName2="";
        if(gender.equalsIgnoreCase("boy")){
            babyName1=dadName.substring(0,2);
            momName.length();
            babyName2=momName.substring((momName.length()-2), momName.length());
            System.out.println(babyName1+babyName2);
        }
        else if(gender.equalsIgnoreCase("girl")){
            babyName1=momName.substring(0,2);
            babyName2=dadName.substring((dadName.length()-2), dadName.length());
            System.out.println(babyName1+babyName2);
        }
    }
}
