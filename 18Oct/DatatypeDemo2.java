/*
Program :To understand Datatype using scanner class
@author: Ajit kumar
@date: 18thOct
*/

// import scanner class
import java.util.*;
//declaring a class
class DataTypeDemo2
{
	//main method
	public static void main(String args[])
	
	{
		// create Scanner class object.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a character");
		// print ASCii value
		
		char charValue = sc.next().charAt(0);
		
		int asciiValue= charValue;
		
		System.out.println("The Ascii value of "+charValue + " is :"+ asciiValue);
		
		//show the path of installation of java
		System.out.println("the version of java is : "+System.getProperty("java.home"));
	}
	// end of main m
	
}	