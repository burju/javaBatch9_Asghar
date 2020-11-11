package class18;

import java.util.Scanner;

/*
Create a method that will accept an array as parameters and will return a sum of all elements from that array.
Method should be visibly only within same package and accessible by the creating an instance of the class.
 */
 class HW_1 {
  //data fields:
  int[] ary;

  //constructors:
 HW_1(int size) {
  ary = new int[size];
 }

 //methods:

static int sumOfElementsInArray(int[] array){
  int sum=0;
 for (int i = 0; i <array.length ; i++) {
   sum+= array[i];
 }
  return sum;
}


 public static void main(String[] args) {

  Scanner input= new Scanner(System.in);
  //deciding the size of the array with user input:
  System.out.println("Please enter the number of elements you want to store in your array");
  int size= input.nextInt();

  // an instance is created and the size is given by the user.
  HW_1 array1= new HW_1(size);

  // filling the array with user input:
  System.out.println("Please fill your array with "+ size + " integers ");
  for (int i = 0; i < size; i++) {
      array1.ary[i]= input.nextInt();
          }

  //calling method to sum all the elements of the array:
  System.out.println( "The sum of " + size + " elements in your array is: "+ sumOfElementsInArray(array1.ary));
 }
}
