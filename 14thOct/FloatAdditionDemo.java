/*
Program :To understand commandline arguments
@author: Ajit kumar
@date: 14thOct
*/
//declaring a class
class FloatAdditionDemo
{
	//main method
	public static void main(String args [])
	{
		
		//declaring local variables
		 int number=Integer.parseInt(args [0]);
		 int number1=Integer.parseInt(args [1]);
		 int number2=Integer.parseInt(args [2]);
		//Calculating sum of two number
		int sum = number+number1+number2;
		//int avg = (number+number1+number2)/3; // calculating avg
		System.out.println("Sum of two number is : "+sum); // print result
		//System.out.println("Avg of two number is : "+avg); // print result
		
	}
	// end of main method
	
}	
//end of class