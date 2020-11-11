package class16_Repl_HWs;
/*
Create a class named 'Main' with specific attributes.
Create two objects of that class in which you will be assigning the following values and then print them.
carColor='Black'
carYear=2019
carMake='BMW'

carColor='White'
carYear=2018
carMake='Toyota'
Expected Output:
Car color is Black and car year is 2019 and car model is BMW
Car color is White and car year is 2018 and car model is Toyota
 */
public class Repl_87 {
    String carColor;
    int carYear;
    String carMake;
    //constructor()
    public Repl_87(){
    }

    public static void main(String[] args) {
        Repl_87 c1= new Repl_87();
        Repl_87 c2= new Repl_87();
        c1.carColor= "Black";
        c1.carYear= 2019;
        c1.carMake="BMW";

        c2.carColor= "White";
        c2.carYear= 2018;
        c2.carMake="Toyota";

        System.out.println("Car color is" + c1.carColor+ " and car year is "+ c1.carYear + " and car model is " + c1.carMake);
        System.out.println("Car color is" + c2.carColor+ " and car year is "+ c2.carYear + " and car model is " + c2.carMake);
    }

}
