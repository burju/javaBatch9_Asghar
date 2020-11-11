package class16;

import java.util.Scanner;

/*
Create a method createEmail().
Based on values of users name,
lastName and email type,
your method should return complete email Address.
Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com or


 */
public class Homework1 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter your name:");
        String userName= input.nextLine();
        System.out.println("Please enter your lastname:");
        String lastName= input.nextLine();
        System.out.println("Please enter your email type:");
        String emailType= input.nextLine();
        createEmail(userName, lastName,emailType);

    }

    //METHOD:
    private static void createEmail( String userName, String lastname, String emailType){
        System.out.println("based on your inputs your email address is:");
        System.out.println(userName.toLowerCase()+lastname.toLowerCase()+"@"+emailType+".com");
    }
}
