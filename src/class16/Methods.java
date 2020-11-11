package class16;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        //static methods called by class name:
        Task.method1(2,3);
        Task.method2(99);
        Task.method3("ey  adanada pide ye");

        Scanner input= new Scanner(System.in);
        System.out.println("Where are you from? ");
        Task.method4("Turkey");
    }
}
