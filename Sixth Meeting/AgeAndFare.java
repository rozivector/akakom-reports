import java.util.Scanner;
public class AgeAndFare
{
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter your age: ");
	int nAge=sc.nextInt();
	int nFare1 = 3;
	int nFare2 = 5;
	int nFare3 = 8;
	if(nAge <= 11)
			{
			System.out.println("Your fare is "+"$"+nFare1);
			}
	else if(nAge > 11 && nAge <= 65)
			{
			System.out.println("Your fare is "+"$"+nFare2);
			}
	else
			{
			System.out.println("Your fare is "+"$"+nFare3);
			}
	sc.close();
	}
}
