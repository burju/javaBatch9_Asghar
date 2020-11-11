package class18;
/*
Create a method that will accept an array as parameters and will return a sum of all elements from that array.
 Method should be visibly only within same package and accessible by the creating an instance of the class.
 */
class Task1 {
    static double sumOfElements(int arrayNum) {
        double[] array = new double[arrayNum];
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }


    public static void main(String[] args) {


        System.out.println(sumOfElements(10));
    }
}




