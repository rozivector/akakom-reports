public class break2
{
	public static void main(String[] args)
	{
	int angka=0;
	while(angka<=10)
		{
		angka++;
		if(angka%2==0)
			{continue;}
		else if (angka == 7)
			{break;}
		System.out.println(angka);
		};
	}
}