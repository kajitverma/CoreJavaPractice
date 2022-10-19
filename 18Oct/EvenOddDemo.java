/*
Program :To understanding various data type in java
@author: Ajit kumar
@date: 19thOct
*/
// import pakages
import java.util.Scanner;

//declar class
class EvenOddDemo
{
	//main method start
	public static void main(String args[])
	{
		//create Scanner class
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the number :");
		// creat variables
		int num = sc.nextInt();
		if((num%2)==0)
		{
			System.out.println("the number is Even :"+num);
		}
		else
		{
			System.out.println("the number is Odd :"+num);
		}
		
	}
	// end of main method
	
}	