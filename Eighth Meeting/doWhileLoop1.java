import java.util.Scanner;
public class doWhileLoop1
{
	public static void main(String[] args)
	{
	Scanner console = new Scanner(System.in);
	int sum = 0;
	System.out.println("Enter a number (-1 to quit): ");
	int num = console.nextInt();
	do
		{
		sum = sum+sum;
		System.out.println("Enter a number (-1 to quit): ");
		num=console.nextInt();
		}
	while(num!=-1);
	System.out.println("The sum is "+sum);
	}
}