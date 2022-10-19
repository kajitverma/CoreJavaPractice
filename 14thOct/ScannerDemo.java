/*
Program : to Understand the input using Scanner
@author : Ajit kumar
@Date   : 14Oct
*/
// importing util class package for scanner class


import java.util.*;

//declaring the class

class ScannerDemo
{
	// main method of Scannerclass
	public static void main(String args[])
	//crating object of Scanner class
	{
		Scanner sc = new Scanner(System.in);
		
		//declaring and initializing local variables
		
		System.out.println("Enter your name : ");
		String name = sc.next();// to take string value
		
		System.out.println("Enter your age : ");
		int age = sc.nextInt(); //to take integer value

		System.out.println("Enter  your Marks : "); // to take float value
		float marks = sc.next.Float();
		
		System.out.println("Enter your pass (true\false) : "); // to take boolean value
		boolean pass = sc.nextboolean();
		
		System.out.println("Enter your Gender : ");
		char gender sc.nextInt().charAt(0)
	// printing the value of all the variables
	{
	System.out.println("-------------------------------------------");
	System.out.println("Enter your Details.............. : ");
	System.out.println("Name : " +name);
	System.out.println("Gender : " +gender);
	System.out.println("Age : " +age);
	System.out.println("Marks : " +marks);
	System.out.println("Pass : " +pass);
	}
	}

      // end of main 
}
// end of class
	
	