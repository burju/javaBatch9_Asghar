package class20_Nov_8.MultiLevel;
/*
Write program for multilevel inheritance where class A inherited by B and class B inherit class by C.
Write program to inherit class A that has method printF which is static and call or reuse that method into class B

 */
public class ClassA {

    String familyName;
    //constructor
    ClassA(){

    }
    ClassA(String familyName) {
        this.familyName = familyName;
        print1();
    }

    void print1(){
    System.out.println("your family name "+ familyName);
}}
