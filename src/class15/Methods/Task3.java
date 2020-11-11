package class15.Methods;

import java.util.Arrays;

/*
Create a String that will hold a sentence. Write a program to get a new String without any spaces.
Create a String that should be combination of letters, numbers and special characters.
Find out how many alpha characters are there in the String
You have a String a=”Is it saturday? Is it raining? Do we have a Java Class today?”
 How would you find out how many sentences are in that String
 */
public class Task3 {
    public static void main(String[] args) {
        //TASK1:
        //Create a String that will hold a sentence. Write a program to get a new String without any spaces.
        String sentence= "Is it saturday? Is it raining? Do we have a Java Class today?";

        System.out.println( sentence.replaceAll(" ", "" ));

        //task2:
        //Create a String that should be combination of letters, numbers and special characters.
        sentence="***$$%%0122232131Is it saturday? Is it raining? Do we have a Java Class today?";
        String sentence2= sentence.replaceAll("[^A-Za-z0-9]", "");

        System.out.println("the number of charachters are:" + sentence2.length());

        //task 3:

        String sentence3= sentence.replaceAll("[^., !, ?]","");
        System.out.println( sentence3.length());
        System.out.println("there are " +sentence3.length() +" seperate sentences in the string" );

        //task3.2
        sentence="Is it saturday? Is it raining? Do we have a Java Class today?";
        String[]array=sentence.split("/?");
        System.out.println(Arrays.toString(array));



    }
}
