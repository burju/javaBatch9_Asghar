package class16_Repl_HWs;
/*
Create a class 'Main' (please do not make it public as Repl will give you an error)
Inside class declare a String variable 'name' and integer variable 'roll_no'.

Create an object of the class and assign the value of 2 to roll_no and value of "John" to name

Your program should print the following:
Name is John and roll number is 2
 */
public class Repl_86 {
    public static void main(String[] args) {
        Main st1= new Main("John", 2);
        System.out.println("Name is " + st1.name + "roll number is " + st1.roll_no );

    }
    static class Main{
        //data fields:

        String name;
        int roll_no;

        // constructors:
        Main(String name, int roll_no){
            this.name=name;
            this.roll_no= roll_no;
        }

    }
}
