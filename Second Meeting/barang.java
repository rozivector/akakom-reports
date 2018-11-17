import java.util.Scanner;

public class barang
{
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Masukan nama barang: ");
	String barang=sc.next();
	System.out.println("Masukan jumlah barang: ");
	int jml=sc.nextInt();
	System.out.println("Masukan harga barang: ");
	double hrg=sc.nextDouble();
	System.out.println("Barang anda: "+barang);
	System.out.println("Harga total anda: "+ (jml*hrg));
	}

}