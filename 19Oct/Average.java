/*
Program :To print Student marks and find average
@author: Ajit kumar
@date: 19thOct
*/
//import Scanner class

import java.util.Scanner;
//declaring a class

class Average
{
	// main mathod
   public static void main(String[] args)
   {
	   //Enter marks of student user input
	   Scanner in = new Scanner(System.in);
	   float a,b,c,sum,avg;
	   System.out.println("Enter 1st Number:");
	   a = in.nextFloat();
	   System.out.println("Enter 2nd Number:");
	   b = in.nextFloat();
	   System.out.println("Enter 3rd Number:");
	   c = in.nextFloat();
	   
	   sum = a+b+c;//Add total marks
	   avg = sum/3;// find Average
	   {
		   //condition apply for cheak pass & fail
		   if(avg>=70)
		       {
				   System.out.println("First Division");
			   }
			   else if(avg>=50)
			   {
				   System.out.println("Second Division");
			   }
			   else if(avg>=45)
			   { 
				   System.out.println("Third Division");
			   }
		   else
		   {
		     System.out.println("Fail");
		   }
		   // End of condition block
	   }
	   // End of main mathod
   }
}//End of class