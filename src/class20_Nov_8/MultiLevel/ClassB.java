package class20_Nov_8.MultiLevel;

import class20_Nov_8.MultiLevel.ClassA;

public class ClassB extends ClassA {

    String fatherName;
    ClassB(){

    }
    ClassB(String fatherName) {
        this.fatherName = fatherName;
        this.print2();
        }
        void print2(){
        System.out.println(" your father's name: " + fatherName);
    }
}
