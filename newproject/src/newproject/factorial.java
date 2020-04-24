package newproject;

import java.util.Scanner;

public class factorial
{
	public void main(String[]args)
	{
		int d,fact=1;
		
		System.out.println("Enter the number:");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

			for (d = 1; d<= n; d++)
			{
				fact = fact * d;
			}
			
			
			System.out.println("Factorial of"+n+" is: "+fact);
		}
}
	
	
