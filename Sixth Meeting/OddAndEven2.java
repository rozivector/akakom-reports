import java.util.Scanner;
public class OddAndEven2
{
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number between 1-10: ");
	int nNumber=sc.nextInt();
	if(nNumber >= 1 && nNumber <=10)
			{
			System.out.println("The Number is "+(nNumber%2 == 0 ? "Even" : "Odd"));
			}
	else
	{
		System.out.println("Your value is invalid");
	}
	sc.close();
	}
}