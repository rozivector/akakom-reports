public class CountDownDoWhile
{
	public static void main(String[] args)
	{
	int i=10;
	System.out.println("CountDown to launch");
	do
		{
		System.out.println(i);
		i--;
		}
	while (i>=0);
	System.out.println("Blast off");
	}
}