package arrays_Primer;

public class Java_Arrays {
//Array is used to stored bunch of value together
// Arrays are used to store multiple values in a single variable
	
public static void main(String[] args) {
int RollNumber[];
/* 
 -After Variable name we apply bracket [] 
 -without square bracket it is just simple integer
 -we declare RollNumber as int Array, 
 -still it does not allocate memory 
 -This is different from when you declare just an int
 -for example int A;
  What java runtime does when it encounter that statement it create space 32bit*/

RollNumber= new int[4];
		
		// Allocates space for 4 ints and assgine to RollNmber
		//here 'new' Operator is important

// double RollNumber =new int [4]; does not work
RollNumber[0]=4;
RollNumber[3]=56;
// Array index in Java is Zero base means first element of array is 0
System.out.println(RollNumber[3]);	

// Create an array of type String called cars

String cars[] = {"Volvo", "BMW", "Ford", "Mazda"};

// Print the second item in the cars array.
System.out.println(cars[1]);
// Change the value from "Volvo" to "Opel", in the cars array.
cars[0]= "Opel"; // dont forget to mention it in double quotation
System.out.println(cars[0]);
//Find out how many elements the cars array have.
System.out.println(cars.length);
	}
}
