import java.util.Scanner;
public class UlangLoopy
{
	public static void main(String[] args)
	{
	Scanner integer = new Scanner(System.in);
	System.out.println("Type a non-negative integer: ");
	int angka = integer.nextInt();
	while(angka<0)
		{
		angka++;
		System.out.println("Invalid number, try again!");
		angka = integer.nextInt();
		}
	int root = angka*angka;
	System.out.println("The square of "+angka+" is "+root);
	}
}