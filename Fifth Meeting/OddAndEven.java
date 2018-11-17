import java.util.Scanner;
public class OddAndEven
{
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the value between 1-10: ");
	int nNumber=sc.nextInt();
	if(nNumber >= 1 && nNumber <=10)
		if(nNumber%2 == 0)
			{
			System.out.println("The Number is even "+nNumber);
			}
		else
			{
			System.out.println("The Number is odd "+nNumber);
			}
	else
	{
		System.out.println("Your value is invalid");
	}
	sc.close();
	}
}