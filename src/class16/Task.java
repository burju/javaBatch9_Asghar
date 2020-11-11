package class16;
/*
Create a method that will take 2 parameters as a numbers and prints which number is larger.
Create a method that will take a number and prints whether the number is even or odd.
Create a method that will print whether given String is palindrome or not.
Create a method that will say Hello in different language based on the country that will passed when method is executed.
 */
public class Task {

    public static void method1( int num1, int num2){
        if(num1> num2){
            System.out.println(num1+ " is larger than" + num2);
        }
        else if( num2> num1){
            System.out.println(num2+ " is larger than" + num1);
        }
        else {
            System.out.println("the two nums are equal");
        }
    }

    public static void method2(int num1){
        if(num1%2==0){
            System.out.println("the number is even");
        }
        else
            System.out.println("the number is odd");
    }

    public static void method3(String sentence){
        boolean isPalindrome = true;
        sentence.replaceAll(" ", "");
        for (int i = (sentence.length() - 1), j = 0; i <=j ; i--, j++) {
            if (sentence.charAt(i) != sentence.charAt(j)) {
                isPalindrome = false;
                break;
            }}

        if (isPalindrome) {
            System.out.println("the sentence is a palindrome");
        } else {
            System.out.println("the sentence is not a palindrome");

        }
    }

    public static void method4( String country){
        if(country.equalsIgnoreCase("Turkey")){
            System.out.println("Merhaba");
        }
        else if(country.equalsIgnoreCase("England")){
            System.out.println("Hello");
        }
        else if(country.equalsIgnoreCase("Spain")){
            System.out.println("Hola");
        }
        else if(country.equalsIgnoreCase("Russia")){
            System.out.println("Zdravstvuj");
        }
        else if(country.equalsIgnoreCase("Greece")){
            System.out.println("Yassou");
        }

    }
}
