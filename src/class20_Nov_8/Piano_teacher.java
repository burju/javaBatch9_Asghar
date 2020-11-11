package class20_Nov_8;

public class Piano_teacher extends Teacher {

    boolean isAPianist;
    String  pianistName;

    Piano_teacher(String pianistName){

        this.pianistName= pianistName;
        if(isAPianist){
        System.out.println( pianistName+ " is also a good pianist");
    }
        else{
            System.out.println(pianistName+ " is not a good pianist");
        }
        System.out.println("The salary of " +pianistName + " is: " + salary);
    }



}
