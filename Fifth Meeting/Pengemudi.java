import java.util.Scanner;
public class Pengemudi
{
	public static void main(String[] args)
	{
	boolean drivingUnderAge;
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter your age: ");
	int nAge=sc.nextInt();
	drivingUnderAge = false;
	if(nAge <= 18)
		{
		drivingUnderAge = true;
		System.out.println("Your age is below 18 years.");
		}
	else
		{
		System.out.println("Your age is above 18 years.");
		}
	sc.close();
	}
}