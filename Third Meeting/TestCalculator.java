import java.util.Scanner;
public class TestCalculator
{
		//field
		public double tax=0.05;
		public double tip=0.15;
		//methods
		public double findTotal(double originalPrice)
				{
				double total=originalPrice*(1+tax+tip);
				return total;
	}
public static void main(String[] args)
	{
	Scanner keyboard=new Scanner(System.in);
	TestCalculator calc=new TestCalculator();
	System.out.print("Enter the originalPrice: ");
	Double originalPrice=keyboard.nextDouble();
	System.out.println("Person: $"+calc.findTotal(originalPrice));
	}
}