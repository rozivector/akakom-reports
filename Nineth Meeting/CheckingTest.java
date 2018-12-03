public class CheckingTest
{
	public static void main(String[] args)
	{
	CheckingAccount data1 = new CheckingAccount();
	data1.name = "Rozi";
	data1.balance = 1000.0;
	data1.showdriver();

	CheckingAccount data2 = new CheckingAccount();
	data2.name = "Edi";
	data2.balance = 5000.0;
	data2.showdriver();

	CheckingAccount data3 = new CheckingAccount();
	data3.name = "Alan";
	data3.balance = 9000.0;
	data3.showdriver();

	CheckingAccount data4 = new CheckingAccount();
	data4.name = "Dani";
	data4.balance = 10000.0;
	data4.showdriver();
	}
}