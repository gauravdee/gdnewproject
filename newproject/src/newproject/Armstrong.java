package newproject;
import java.util.Scanner;

public class Armstrong 
{
public static void main(String[]args)
{
	int num ,number, temp, total=0;
	System.out.println("Enter 3 digit number");
	Scanner obj = new Scanner(System.in);
	int num1 = obj.nextInt();
	number = num1;
	while(number !=0)
			{
				temp = number % 10;
				total = total + temp*temp*temp;
				number /=10;
			}
	if(total == num1)
		System.out.println(num1 +"is a armstrong number");
	else
		System.out.println(num1 + "is not armstrong number");
	 
	
}
}
