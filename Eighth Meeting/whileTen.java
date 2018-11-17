public class whileTen
{
	public static void main(String[] args)
	{
	int hitung=0;
	int jumlah=0;
	while(hitung<10)
		{
		hitung++;
		if(hitung%1==0)
			{jumlah+=hitung;}
		else {continue;}
		}
	System.out.println("Jumlah 10 bilangan pertama adalah "+jumlah);
	}
}