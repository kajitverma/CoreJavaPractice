/*
Program: WAP to print the grade according to the percentage
@author: Ajit kumar
@Date: 19 oct 2022  
*/
//import packages of Scanner
import java.util.Scanner;
// declaring class
class IfelseLadderDemo
{
	//main mathod start
	public static void main(String args[])
	{
	//declaring object of Scanner
	Scanner sc = new Scanner(System.in);
	
	//declaring variables
	int n1,n2,n3,n4;
	
	//taking input
	System.out.println("Enter the 1st number  : ");
	n1 = sc.nextInt();
	System.out.println("Enter the 2nd number  : ");
	n2 = sc.nextInt();
	System.out.println("Enter the 3rd number  : ");
	n3 = sc.nextInt();
	 
	
	//cheaking greater number 
	if((n1>n2)&&(n1>n3))
		{
			System.out.println("the greater number is   :"+n1);
		}
		else if(n2>n3)
		{
			System.out.println("The greater number is   :"+n2);
			
		}
	else
		{
			System.out.println("The greater number is   :"+n3);
		}
	}// End of main method
}// end of class