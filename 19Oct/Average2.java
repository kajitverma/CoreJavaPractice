/*
Program :To understand commandline arguments
@author: Ajit kumar
@date: 19thOct
*/
//declaring a class
class Average2
{
	//main method
	public static void main(String args [])
	{
		
		//declaring local variables
		 float number=Float.parseFloat(args [0]);
		 float number=Float.parseFloat(args [1]);
		 float number=Float.parseFloat(args [2]);
		//Calculating sum of two number
		float sum = number+number1+number2;
		int avg = (number+number1+number2)/3; // calculating avg
		System.out.println("Sum of two number is : "+sum); // print result
		System.out.println("Avg of two number is : "+avg); // print result
		{
			if(avg>=40)
			{
				System.out.print("pass");
			}
			else
			{
				System.out.println("fail");
			}	
		}
	}
	// end of main method
	
}	
//end of class