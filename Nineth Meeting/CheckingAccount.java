public class CheckingAccount
{
	public static void main(String[] args) //bersifat opsional
	{
		Double balance = 1000.0; //default pada main
		String name = "Rozi"; //default pada main
	}
	public String name;
	public Double balance;

	public void showdriver()
	{
	System.out.println("Name: " + name);
	System.out.println("Balance: "+ balance);
	System.out.println();
	}
}