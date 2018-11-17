import java.util.Scanner;
public class Scholarship2
{
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Your Grade?");
	int nGrade = sc.nextInt();
	System.out.println("Enter Your Absent?");
	int nDaysAbsent = sc.nextInt();
	if (nGrade>=88 || nDaysAbsent==0)
		{
		System.out.println("You qualify for scholarship");
		}
	else
		{
		System.out.println("You do not qualify for scholarship");
		}
	}
}