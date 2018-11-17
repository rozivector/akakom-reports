import java.util.Scanner;
public class SPPVAR2
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
	System.out.print("Masukan IP anda: ");
	double ip = sc.nextDouble();
	System.out.println();
	double tolter = teori*80000;
	double tolprak = prak*120000;
	double tolprum = prum*150000;
	double sppvar = tolter + tolprak + tolprum;
	if(ip >= 3.0)
		{
		double disc = (sppvar*25)/100;
		double resdisc = sppvar - disc;
		System.out.println("Total SPP variabel anda: "+resdisc);
		}
	else
		{
		System.out.println("Total SPP variabel anda: "+sppvar);
		};
	sc.close();
	}
}