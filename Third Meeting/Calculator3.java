public class Calculator3
{
	//field
	public double tax=0.05;
	public double tip=0.15;
	//methods
	public double getTip()
	{
	return tip;
	}

	public void printTip()
	{
	System.out.println("Jumlah Tip: "+tip);
	}

	public double findTotal(double originalPrice)
	{
	double total=originalPrice*(1+tax+tip);
	return total;
	}

	public static void main(String[] args)
	{
	Calculator3 calc=new Calculator3();
	calc.printTip();
	}
}
