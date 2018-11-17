import java.util.Scanner;
public class BreakFor
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int numInputs=10, input=0, sum=0, stopLoop=999;
		System.out.println("Enter 10 Numbers");
		for(int i=0; i<numInputs; i++)
			{
			input = in.nextInt();
			if(input==stopLoop)
				{break;}
			else {sum += input;}
			}
		System.out.println("The sum of numbers: "+sum);
	}
}