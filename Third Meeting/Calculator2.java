public class Calculator2
{
	//field
	public double tax=0.05;
	public double tip=0.15;
	//methods
	public double getTip()
	{
	return tip;
	}

	public double findTotal(double originalPrice)
	{
		double total=originalPrice*(1+tax+tip);
		return total;
	}

	public static void main(String[] args)
	{
		Calculator2 calc=new Calculator2();
		calc.tip=0.10;
		System.out.println("Jumlah Tip (%): "+(calc.getTip()*100));
	}
}