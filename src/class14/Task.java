package class14;

import javax.xml.transform.sax.SAXSource;
import java.util.Scanner;

public class Task {


    /*Accept username, password and confirm password from a user and check following requirements:
    Username and Password cannot be  empty, if so→ message=”Username and Password cannot be empty”.
    Password should be minimum 8 characters, if less → message=”Password is too short”.
    Password cannot contain username if so, → message=”Password cannot contain username”.
    Password should match confirmed password, if not  → message=“Passwords do not match”.
    Only after all requirements met → message “Your username and password has been created”
     *
     */

        public static void main(String[] args) {

            Scanner input= new Scanner(System.in);
            boolean pass= false;

            System.out.println("Please enter the user name, password ");
            String userName= input.next();
            String password= input.next();
            System.out.println("Please confirm your password");
            String password_confirm= input.next();


            //METHODS========================================================
            //Username and Password cannot be  empty, if so→ message=”Username and Password cannot be empty”.
            pass= isItEmpty( userName, password, password_confirm);
            //Password should be minimum 8 characters, if less → message=”Password is too short”.
            pass= isPassWordLong(password, password_confirm);
            // Password cannot contain username if so, → message=”Password cannot contain username”.
            pass= doesPasswordHasUserName(userName, password, password_confirm);
            // Password should match confirmed password, if not  → message=“Passwords do not match”.
            pass= doesPasswordMatch(password,password_confirm);

          if( pass){
              System.out.println("Your username and password has been created");
          }

        }



    public static boolean doesPasswordMatch(String password, String origPassword) {
            boolean pass= false;
        if(password.equals(origPassword)==false){
            System.out.println("Password does not match");
            pass=false;}
             else{
                pass=true;
            }
             return pass;
    }


    public  static boolean isItEmpty(String userName, String password, String password_confirm) {
        boolean pass= false;
            if( userName.isEmpty() || password.isEmpty() || password_confirm.isEmpty()) {
                System.err.println("Username and Password cannot be empty");
                pass = false;
            }
            else{
                pass=true;
            }
            return pass;

        }



    public static boolean isPassWordLong(String password, String password_confirm) {
        boolean pass= false;
        if(password.length()<8 || password_confirm.length()<8){
            System.out.println("Password is short");
            pass= false;
        }
        else{
            pass=true;
        }
        return pass;
    }



    private static boolean doesPasswordHasUserName(String userName, String password, String password_confirm) {
        boolean pass = false;
        if (password.contains(userName) || password_confirm.contains(userName)) {
            System.out.println("Password cannot contain username");
            pass = false;
        }
        else{
            pass=true;
        }
        return pass;
    }


    }

