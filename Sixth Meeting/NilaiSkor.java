import java.util.Scanner;
public class NilaiSkor
{
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.print("Masukan NIM: ");
	int nnim=sc.nextInt();
	System.out.print("Masukan Nilai Tugas: ");
	int nX=sc.nextInt();
	System.out.print("Masukan Nilai UTS: ");
	int nY=sc.nextInt();
	System.out.print("Masukan Nilai UAS: ");
	int nZ=sc.nextInt();
	System.out.println();
	System.out.println("=======");
	System.out.println("NIM anda: "+nnim);
	int nAkhir=(nX*30/100)+(nY*30/100)+(nZ*40/100);
	if(nAkhir >= 80)
		{
		String Grade = "A";
		System.out.println("Nilai Akhir anda: "+Grade);
		}
	else if(nAkhir <= 79 && nAkhir >= 70)
		{
		String Grade = "B";
		System.out.println("Nilai Akhir anda: "+Grade);
		}
	else if(nAkhir <= 69 && nAkhir >=60)
		{
		String Grade = "C";
		System.out.println("Nilai Akhir anda: "+Grade);
		}
	else if(nAkhir <= 59 && nAkhir >=50)
		{
		String Grade = "D";
		System.out.println("Nilai Akhir anda: "+Grade);
		}
	else
		{
		String Grade = "E";
		System.out.println("Nilai Akhir anda: "+Grade);
		}
	sc.close();
	}
}