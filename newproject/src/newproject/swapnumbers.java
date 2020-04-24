package newproject;

public class swapnumbers 
{
public static void main(String[]args)
{
	int first = 3 ;int second = 5;
	System.out.println("---Before swap---");
	System.out.println("First Number = " + first);
	System.out.println("Second Number = " + second);
	
	int temp = first;
	first=second;
	second = temp;
	System.out.println("---After swap---");
	System.out.println("First Number = " + first);
	System.out.println("Second Number = " + second);
	
	
}
}
