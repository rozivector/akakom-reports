import java.util.Scanner;
public class Biodata
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Masukkan NIM anda: ");
	int nim=sc.nextInt();
	System.out.println("Masukan Nama anda: ");
	String namad=sc.next();
	String namab=sc.nextLine();
	System.out.println("Masukan Jurusan anda: ");
	String jur=sc.next();
	String jurb=sc.nextLine();
	System.out.println("Masukan IPK anda: ");
	double ipk=sc.nextDouble();
	System.out.println();
	System.out.println("==========");
	System.out.println("Hasil data anda: ");
	System.out.println("Nama anda: "+namad+namab);
	System.out.println("NIM anda: "+nim);
	System.out.println("Jurusan anda: "+jur+jurb);
	System.out.println("IPK anda: "+ipk);
	}
}
