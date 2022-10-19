/*
Program: WAP to print the grade according to the percentage
@author: Ajit kumar
@Date: 19 oct 2022  
*/

//import packages of Scanner

import java.util.Scanner;
//declar class
class GradSystemDemo
{
	//main method
	public static void main(String args[])
	{
		//declar object of scanner
		Scanner sc = new Scanner(System.in);
		
		//declar variables
		float percentage;
		char grade;
		
		//taking input 
		System.out.println("Enter the percentage....:");
		percentage= sc.nextFloat();
		
		//check percentage and calculate grade
			if(percentage>=85)
	     	 grade='A';
				else if(percentage>=70)
				grade='B';
					else if(percentage>=65)
						grade='C';
						else if(percentage>=45)
                           grade='D';
                           else
                             grade='F';
//end of ifelse
						 	   		
        if(grade=='F') // compare
	      System.out.println("Sorry   You have failed... ");
		else
            System.out.println("You have cleared the exam with grade:"+grade);		   
		    
	}// end of main
		
}// end of class
 
