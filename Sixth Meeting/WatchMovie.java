import java.util.Scanner;
public class WatchMovie
{
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the movie ticket price: $");
	int nTicket = sc.nextInt();
	System.out.print("Enter the rating of the movie: ");
	int nRate = sc.nextInt();
	if (nTicket>=12 && nRate==5)
		{
		System.out.println("I'm interested in watching the movie");
		}
	else
		{
		System.out.println("I am not interested in watching the movie");
		}
	}
}