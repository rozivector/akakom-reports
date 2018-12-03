import java.util.Scanner;
public class pinUser
{
	public static void main(String[] args)
	{
	System.out.println("Masukan PIN baru anda: ");
	Scanner go = new Scanner(System.in);
	int baru = go.nextInt();
	database data1 = new database();
	data1.PIN = baru;
	System.out.println("Masukan PIN anda sekarang: ");
	int masuk = go.nextInt();
	int count = 1;
	while (baru != masuk && count <=3)
		{
		System.out.println("Maaf, PIN salah. Anda diberi kesempatan 3x ("+count+"x)");
		masuk = go.nextInt();
		count++;
		}
	if(baru != masuk && count == 4)
	{
		System.out.println("Maaf, akun anda telah diblokir!");
	}
	else if(baru == masuk)
		{
			System.out.println("Selamat datang, silakan tekan lanjutkan!");
		};
	}
}