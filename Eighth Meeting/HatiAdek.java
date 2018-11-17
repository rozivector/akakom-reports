import java.util.Scanner;
public class HatiAdek
{
	public static void main(String[] args)
	{
		System.out.println("Daftar suasana hati: ");
		System.out.println("1. senang");
		System.out.println("2. marah");
		System.out.println("Bagaimana suasana hati adik?");
		Scanner masuk = new Scanner(System.in);
		String suasana = masuk.nextLine();
		while (!suasana.equals("senang") && !suasana.equals("marah"))
					{
					System.out.println("Maaf, data tidak valid, Coba lagi");
					suasana = masuk.nextLine();
					}
		while (suasana.equals("marah"))
			{
				System.out.println("Senyum dong! ^_^");
				System.out.println("Bagaimana suasana hati adik sekarang?");
				suasana = masuk.nextLine();
				while (!suasana.equals("senang") && !suasana.equals("marah"))
				{
					System.out.println("Maaf, data tidak valid, Coba lagi");
					suasana = masuk.nextLine();
				}
			}
		if(suasana.equals("senang"))
		{System.out.println("Yee.. Gitu dong ^o^");}
	}

}

