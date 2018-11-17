public class Scope1
{

	public static void main(String[] args)
	{
	int i = 1;
	int x = 0;
	for (int j=2; j<=5; j++)
		{
		System.out.println(j);
		int k=3;
		System.out.println(x+i+j+k);
		}
	}
}