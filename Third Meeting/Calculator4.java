public class Calculator4
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
	Calculator4 calc=new Calculator4();
	double tip=calc.getTip();
	System.out.println("Jumlah Tip: "+tip);
	}
}
