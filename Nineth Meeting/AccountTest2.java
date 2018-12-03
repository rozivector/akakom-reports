public class AccountTest2
{
	public static void main(String[] args)
	{
	SavingAccount sa0001 = new SavingAccount();
	SavingAccount sa0002 = new SavingAccount();

	//mereferensi object yang sama
	sa0001=sa0002;
	sa0001.name = "Bubba";
	sa0002.name = "Twitch";
	//memiliki data yang sama
	System.out.println(sa0001.name);
	System.out.println(sa0002.name);
	System.out.println();

	//memiliki lokasi memori yang sama
	System.out.println(sa0001==sa0002);
	}
}