/*
Program :To understand NestedIfDemo2
Program :WAP to printto donate blood if or not and cheak gender
@author: Ajit kumar
@date: 19thOct
*/
// import pakages
import java.util.*;

//declaring a class
class NestedIfDemo2
{
	//main method
	public static void main(String args [])
	{
		// declaring variables
		int age;
		float weight;
		char gender;
		// declaring objet of scanner
		Scanner sc = new Scanner(System.in);
		
		//taking input
		  System.out.println(System.in);
		  age= sc.nextInt();
		  
		  // cheaking criteria
		  
		  if(age>=18)
		  {
			  System.out.println("Enter your gender (m/f) :");
			  gender = sc.next().charAt(0);
			  if(gender=='m')
				  {
					System.out.println("Enter your weight...:");
					weight= sc.nextFloat();
				  }
					  // cheaking weight criteria
					  if(weight>=60)
					  {
						  System.out.println("congratulation !!  you can donate the blood  Thank You.");
					  }
					  else(weight>=50)
					  {
							  System.out.println("you are underweight.. please start healthy eating habits");
					  }
			 //end of nested ifelse
			}
		 }
		else
		{
		System.out.println("you are underAge..!! you can't donate..");
		}// end od outer ifelse
			
	}// end of main method
}
//end of class