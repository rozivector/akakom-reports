public class doWhileTen
{
	public static void main(String[] args)
	{
	int hitung=0;
	int jumlah=0;
	do
		{
		hitung++;
		if(hitung%1==0)
			{jumlah+=hitung;}
		else {continue;};
		}
	while(hitung<10);
	System.out.println("Jumlah 10 bilangan pertama adalah "+jumlah);
	}
}