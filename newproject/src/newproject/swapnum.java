package newproject;
import java.util.Scanner;


public class swapnum 
{
public static void main(String []args)
{
	System.out.println("Enter the value of x and y");
	Scanner a = new Scanner(System.in);
	int x = a.nextInt();
	int y = a.nextInt();
	System.out.println("before swaping number "+x+" "+ y);
	x=x+y;
	y=x-y;
	x=x-y;
	System.out.println("After Swaping :"+x+" "+ y);
}
}
