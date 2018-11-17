import java.util.Random;
public class LatihanRandom1
{
	public static void main(String[] args)
	{
	Random rndNum = new Random();
	int randomNum = rndNum.nextInt();
	System.out.println("Random number: " + randomNum);
	}
}