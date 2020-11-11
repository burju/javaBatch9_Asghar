package class20_Nov_8.MultiLevel;

import class20_Nov_8.MultiLevel.ClassC;

public class MultilevelInheritanceTested {
    public static void main(String[] args) {


    ClassC person1= new ClassC("Kim");// constructor sadece classC'den geliyor. ve onun printmetodu calisacak.
        // ama istersek diger siniflarin metodlarini elle cagirabilirizm
        person1.familyName= "Alexia";
        person1.fatherName= "John";
       // System.out.println(person1.familyName+ " " + person1.fatherName+ " "+ person1.yourName);
        person1.print2();
        person1.print1();


}}
