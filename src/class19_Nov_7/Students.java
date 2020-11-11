package class19_Nov_7;
/*
Write a java program of Class Students that takes students name and 3 subject grades.
Inside your class also have a method to Calculate Average Grade.
Test Student class for 5 different students with different marks. Your program should print an average mark of each students name.
NOTE: please use different names for instance and local variables.
 */
public class Students {
    //data fields:
    String name;

    int history_grade;
    int math_grade;
    int english_grade;
    double averageGrade;

    //No Arg constructor
    Students() {
        this.name = name;
//        this.english_grade= getEnglish_grade();
//        this.history_grade=getHistory_grade();
//        this.math_grade=getMath_grade();
        this.averageGrade = averageGrade();
    }

    //4 arg constructor & with an embeded method
    Students(String name, int history_grade, int math_grade, int english_grade) {
        this.name = name; // parantez icinde koydugumuz degeri datafieldstan gelen var'a yapistiriyoruz.
        this.history_grade= history_grade;
        this.math_grade= math_grade;
        this.english_grade= english_grade;


        averageGrade = averageGrade();
    }

    //METHOD:
    public double averageGrade() {
        if (history_grade > 100 || history_grade < 0 || math_grade > 100 || math_grade < 0 || english_grade > 100 || english_grade < 0) {
            System.out.println("Error");
        }
        return (double) ((history_grade + math_grade + english_grade) / 3);
    }


//MAIN ====================================================================================================

    public static void main(String[] args) {

        Students s1= new Students();
        s1.name= "ali";
        s1.english_grade= 90;
        s1.math_grade= 80;
        s1.history_grade= 60;


        Students s2= new Students("Veli", 19, 100, 100);
        Students s3= new Students("Celi", 60, 100, 10);
        Students s4= new Students("Keli", 100, 70, 100);
        Students s5= new Students("Zeli", 50, 100, 50);
        System.out.println("the average grade of " + s1.name + " is "+ s1.averageGrade);
        System.out.println("the average grade of " + s2.name + " is " + s2.averageGrade);
        System.out.println("the average grade of " + s3.name + " is " + s3.averageGrade);
        System.out.println("the average grade of " + s4.name + " is " + s4.averageGrade);
        System.out.println("the average grade of " + s5.name + " is " + s5.averageGrade);
    }
}
