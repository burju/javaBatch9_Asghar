package class16;

import java.util.Scanner;

public class Extra {
    public static void main(String[] args) {
fizzBuzz(9);
    }
    private static void fizzBuzz (int n) {
        for (int i = 0; i < n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0 && !(i % 5 == 0)) {
                System.out.println("Fizz");}
            else if (i % 5 == 0 && !(i % 3 == 0)) {
                System.out.println("Buzz");
            } else if (!(i % 3 == 0 && i % 5 == 0)) {
                System.out.println(i);
            }
        }
    }}