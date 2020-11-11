package class19_Nov_7;
/*
TASK A:

Write a program  that will have 4 different access levels of constructors
and create 3 objects of this class:
 1 - inside same class;
 2 - from outside the class;
 3 - from different class inside different package  and observe result.

 TASK B:
 Write program that have static constructor and observe result.
 */

public class ClassWithAccessModifiers {

    String name;
    int number;
    int age;
    int height;
    static String name_default;
    static int number_default;
    static int age_default;
    static int height_default;


     //private constructor accessible from the same class
    private ClassWithAccessModifiers(){
        // I can only create objects of my class from the same class.
    }


    //1 arguement public constructor accessible from outside the class and package.
    public ClassWithAccessModifiers(String name){
    }
    //2 args , default constructor accessible from outside the class & from the same package
     ClassWithAccessModifiers(String name, int number){
    }

//    static ClassWithAccessModifiers(){
//        name_default= "All students will see this name when they call this static constructor";
//
//--> Constructors cannot be STATIC:
//If you made constructor as static then the constructor will be called before object creation same like main method.
//because the main reason of constructors are being able to assign values. static defeats the purpose
//    }

    public static void main(String[] args) {
        ClassWithAccessModifiers task1= new ClassWithAccessModifiers();
        task1.name= "Marta";
        task1.age= 22;
        task1.height= 175;
        System.out.println(task1.age + ", " + task1.height + task1.name);
    }

}
