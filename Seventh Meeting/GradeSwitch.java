import java.util.Scanner;
public class GradeSwitch
{
	public static void main(String[] args)
	{
	Scanner in = new Scanner(System.in);
	System.out.println("Enter your grade?");
	int grade = in.nextInt();
	switch (grade)
		{
		case 9 : System.out.println("You are a freshman");
		break;
		case 10 : System.out.println("You are a sophomore");
		break;
		case 11 : System.out.println("You are a junior");
		break;
		case 12 : System.out.println("You are a senior");
		break;
		default : System.out.println("Invalid grade");
		}
	}
};