import java.util.Scanner;
public class SPPVAR
{
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.print("Masukan SKS pada teori: ");
	int teori = sc.nextInt();
	System.out.print("Masukan SKS pada praktik: ");
	int prak = sc.nextInt();
	System.out.print("Masukan SKS pada praktikum: ");
	int prum = sc.nextInt();
	double tolter = teori*80000;
	double tolprak = prak*120000;
	double tolprum = prum*150000;
	double sppvar = tolter + tolprak + tolprum;
	double disc = (sppvar*25)/100;
	double resdisc = sppvar - disc;
	System.out.println();
	System.out.println("Total SPP variabel anda: "+resdisc);
	sc.close();
	}
}