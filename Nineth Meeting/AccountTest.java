public class AccountTest
{
	public static void main(String[] args)
	{
	SavingAccount sa0001 = new SavingAccount();
	sa0001.name = "Damian";
	sa0001.deposit(1000);
	//nilai balik digunakan dalam perhitungan
	sa0001.balance += sa0001.calcInterest();
	//nilai balik ditampilkan ke layar
	sa0001.interestRate = 0.02;
	sa0001.displayCustomer();
	System.out.println("Nilai interest: " + sa0001.calcInterest());
	//alamat pada data 1
	System.out.println(sa0001);

	System.out.println();

	SavingAccount sa0002 = new SavingAccount();
	sa0002.balance = 2000;
	sa0002.name = "Bill";
	sa0002.displayCustomer();
	//alamat pada data 2
	System.out.println(sa0002);

	System.out.println();

	SavingAccount sa0003 = new SavingAccount();
	sa0003.balance = 3000;
	sa0003.name = "Sam";
	sa0003.displayCustomer();
	//alamat pada data 3
	System.out.println(sa0003);
	System.out.println();
	//perbandingan alamat memory
	System.out.println(sa0001==sa0002);

	}
}