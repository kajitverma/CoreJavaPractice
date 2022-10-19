/*wap to cheak eligible for vote or not
@Author: Ajit kumar 
@Date : 18thOct
*/
// import packages
import java.util.*;

//declaring a class
class VoteDemo
{
public static void main(String []args)
	{
	//declaring variables
		
		int age;
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter your age:");
		age= sc.nextInt();

	//condition apply for vote
		
	if(age>=18)
		{
		System.out.println("eligible for vote");
		}
	else
		{
			System.out.println("Not eligible for vote :");
		}

	}// end of main
}//end of class