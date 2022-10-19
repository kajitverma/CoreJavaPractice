/*
Program :To understand commandline arguments
@author: Ajit kumar
@date: 14thOct
*/
//declaring a class
class AdditionDemo
{
	//main method
	public static void main(String args[])
	{
		
		//declaring local variables
		 int number= Integer.parseInt(args[0]);
		 int number1= Integer.parseInt(args[1]);
		 
		//Calculating sum of two number
		int sum = number+number1;
		System.out.println("Sum of two number is : "+sum);// print result
		
	}
	// end of main m
	
}	