public class Calculator5
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
		java.util.Scanner keyboard=new java.util.Scanner(System.in);
		Calculator5 calc=new Calculator5();
		calc.tip=0.10;
		System.out.println("Tax: "+calc.tax);
		System.out.println("Tip: "+calc.tip);
		System.out.println("Enter the originalPrice: ");
		Double originalPrice=keyboard.nextDouble();
		System.out.println("Person: $"+calc.findTotal(originalPrice));
	}
}