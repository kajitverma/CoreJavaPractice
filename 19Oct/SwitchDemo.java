/*
Program: wap to print the day according to number using switchcase
@author: Ajit kumar
@Date: 19 oct 2022  
*/

//import packages 

import java.util.Scanner;
//declar class
class SwitchDemo
{
	// method to print the day
	static void printDay(int A)
	{	
	
	   //switch case
	   switch(A)
	   {
		    case 1:System.out.println("Monday");
		          break;
		    case 2:System.out.println("Tuesday");
		          break;
		    case 3:System.out.println("Wednesday");
		          break;
		    case 4:System.out.println("Thursday");
		          break;
		    case 5:System.out.println("Friday");
		          break;
		    case 6:System.out.println("Saturday");
		          break;
		    case 7:System.out.println("Sunday");
		          break;
		    default: System.out.println("Wrong input");
				  
	   }
	// end of switch
	
	  
	}
	//end of method printDay
	
	//main started
	public static void main(String args[])
	{
	
	   //declar object of scanner 
		Scanner sc = new Scanner(System.in);
		
		//declar variable
		int day;
		System.out.println("Enter any number 1 to 7:");
		day= sc.nextInt();
		
		//calling method to print day
		printDay(day);
		    
	}// end of main
}   // end of class 
