package class16;

import java.util.Scanner;

/*
Write a method to return whether given number is prime or not?
 */
public class Homework2 {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("please enter a number");
        int num= input.nextInt();
        boolean isPrime= isPrimeOrNot(num);
        if(isPrimeOrNot(num)){
            System.out.println("The number entered by the user is a prime number");
        }
        else{
            System.out.println("The number entered by the user is not a prime number");

    }}

//METHOD:
    private static boolean isPrimeOrNot(int num) {
        //prime numbers are divisible only by itself and 1.
        boolean isPrime= false;
        if( num==2) {
            isPrime = true;
        }
        else if (num>2) {
            for (int i = 2 ; i <num ; i++) {
               if(num%i==0 ){
                  isPrime=false;
                  break;
                  }
               else
                  isPrime=true;
                }
            }
        return isPrime;
    }
}
