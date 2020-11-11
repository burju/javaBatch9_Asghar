package class13;

import java.util.Scanner;

public class Account_Test {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //2 different objects created using Account class:

        Account customer1 = new Account();
        customer1.accountID = "123";
        customer1.userName = "Elijah";
        customer1.password = "pass123";
        customer1.balance = 150_000;
        customer1.limit = 125;
        customer1.isBlocked = false;

        Account customer2 = new Account();
        customer2.accountID = "456";
        customer2.userName = " Burcu";
        customer2.password = "password123";
        customer2.balance = 100_000;
        customer2.limit = 100;
        customer2.isBlocked = false;

        System.out.println("Hello " + customer1.userName + ", please enter your user name and password ");
        boolean login = customer1.login(input.next(), input.next());

        if (login == true) {

            System.out.println("Please enter the amount you want to transfer:");
            double transferAmount = input.nextDouble();
            if (!customer1.isSuccess(customer1.balance, transferAmount)) {
                System.out.println("you do not have enough credit in your balance. ");
            } else {
                       System.out.println("The transaction is a success ");
            }

        }}
    }

