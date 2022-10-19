/*
Program :To understand NestedIfDemo
Program :WAP to printto donate blood if or not 
@author: Ajit kumar
@date: 19thOct
*/
// import pakages
import java.util.*;

//declaring a class
class NestedIfDemo
{
	//main method
	public static void main(String args [])
	{
		// declaring variables
		int age;
		float weight;
		Scanner sc = new Scanner(System.in);
		//taking input
		  System.out.println(System.in);
		  age= sc.nextInt();
		  // cheaking criteria
		  
		  if(age>=18)
		  {
			  System.out.println("Enter your weight...:");
			  weight= sc.nextFloat();
			  // cheaking weight criteria
			  if(weight>=60)
				  System.out.println("you can donate the blood...");
			  else
				  System.out.println("you are underweight.. please start taking healthy food..");
			  //end of nested ifelse
		  }
		else
	
		System.out.println("you are underage..!! you can't donate..");
		}
	}
	// end od outer ifelse
	// end of main method

//end of class