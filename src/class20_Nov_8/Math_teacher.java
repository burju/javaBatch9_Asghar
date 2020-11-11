package class20_Nov_8;

public class Math_teacher extends Teacher {
    boolean doesLoveNumbers;
    String mathematecianName;

    Math_teacher(String mathematecianName) {
        this.mathematecianName = mathematecianName;


        if (doesLoveNumbers) {
            System.out.println("is also a good Math teacher");
        } else {
            System.out.println("is not a good Math teacher");
        }

        System.out.println("The salary of" + mathematecianName + " is: " + salary);
    }
    }

