package class19_Nov_7;
/*
Write a program that will have a constructor:
one with parameters and second without any parameters.
Create a separate Test class where you will execute both of the constructors 1 by 1.



 */
public class Student {

    String name;
    int age;
    char grade;
    double height;
    double weight;

    Student(){

    }
    Student( String Bname, int Bage, double Bheight, double Bweight){
        if (Bname.equals("")){
            System.out.println(" please enter your name");
        }
        if(Bage<0 ||Bage>100){
            System.out.println("please enter a valid age");
        }
    }


    public static void main(String[] args) {
        Student s1= new Student();
        s1.name= "Jon";
        s1.age= 200;

        Student s2= new Student("Can", 200, 200, 200);

    }
}
