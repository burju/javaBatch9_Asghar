package class20_Nov_8;
/*
Write a Student class   that have instance variables name and address.
Create a constructor that will initialize those variables.
Print name & address of given  student using displayInfo method.



 */
public class Student {

    private String name;
    private String address;

    Student(String name, String address){
        this.name= name;
        this.address=address;
        displayInfo(); // this will be automatically printed because it will be initiated as the constructor introduced.
    }

    void displayInfo(){
        System.out.println("The name is: " + name + " and the address is: " + address);
    }


    public static void main(String[] args) {
        Student s1= new Student("ayse", "sherman");
        s1.displayInfo();
    }
}
