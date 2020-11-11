package class13;
/*
    write a method that takes the amount that user wants to
     transfer
      it deducts the amount from your balance and

    returns the amount of transfer in case of success or a 0
    in case of failure
     */

import java.util.Scanner;
public class Account {

    String accountID;
    String userName;
    String password;
    double balance;
    double limit;
    boolean isBlocked;

    ///writing METHODS:
    boolean login(String userName, String password) {
        if (userName.equals("Syntax") && password.equals("pass123")) {
            return true;
        } else {
            return false;
        }
    }
  // method that gets transfer amount from the user substracts it from the balance
    // and returns boolean value

    public boolean isSuccess(double balance, double transferAmount) {
        boolean isSuccess;

        if(transferAmount<balance) {
            isSuccess=true;
        }
        else {
            isSuccess=false;
        }

        return isSuccess;
    }
    }


