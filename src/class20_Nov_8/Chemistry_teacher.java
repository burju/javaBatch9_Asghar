package class20_Nov_8;

public class Chemistry_teacher extends Teacher {
    boolean isAScientist;
    String chemistName;

    Chemistry_teacher(String chemistName){

        this.chemistName= chemistName;

        if(isAScientist){
            System.out.println(chemistName+ " is also a good Chem Teacher");
        }
        else{
            System.out.println(chemistName+ " is not a good Chem Teacher");
        }
        System.out.println("The salary of" + chemistName + " is: " + salary);
    }


}
