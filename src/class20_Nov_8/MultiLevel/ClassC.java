package class20_Nov_8.MultiLevel;

import class20_Nov_8.MultiLevel.ClassB;

public class ClassC extends ClassB {

    String yourName;
    ClassC (){

    }
    ClassC(String yourName) {
        this.yourName = yourName;
        this.print3();
    }
    void print3(){   System.out.println("for your name:" + yourName) ;
    }


}
