package class20_Nov_8;
/*

Write a Java program called Teacher.
Identify features and behaviour of that Class.
Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher that would have it their own
 features and behaviour. Test all 4 classes
 */
public class Teacher {

    String schoolname= "Griffindor";
    boolean isEducator= true;
    double salary=1200;

    Teacher(){
        System.out.println("All the teachers  working at " + schoolname + " earns: $" + salary);

    }


}
