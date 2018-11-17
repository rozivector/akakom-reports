import java.util.Scanner;
public class BodyMassIndex
{
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the weight in pounds: ");
	double weight = sc.nextDouble();
	System.out.println("Enter the height in inches: ");
	double height = sc.nextDouble();
	double bmi = ((weight*70)/(height*height));
	System.out.println();
	System.out.println("-----");
	System.out.println("Your weight is " + weight);
	System.out.println("Your height is " + height);
	System.out.println("Your Body Mass Index is " + bmi);
	sc.close();
	}
}