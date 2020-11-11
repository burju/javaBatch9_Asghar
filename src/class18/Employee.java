package class18;
/*
Create a Class called Employee:
Create three  variables  empID , salary and set the CEO to “Sumair”
Create two objects of the class Employee
Set the value of eID, salary for each of the objects
Print out the eID , salary and  CEO for each of the objects
 */
public class Employee {

    int empID;
    double salary;
    static String CEO;

    //constructor:
    private  Employee(){
    }

    public static void main(String[] args) {
        Employee e1= new Employee();
        e1.empID= 91;
        e1.salary= 100_000;
        Employee.CEO="Sumair";


    }


}
