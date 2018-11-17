import java.util.Scanner;
public class StringName
{
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the name: ");
	String name = sc.next();
	String namey = "Moe";
	boolean cool = name.equals(namey);
	if(cool != false)
	{
	System.out.println("You are the king of rock and roll");
	}
	else
	{
	System.out.println("You are not the king");
	}
	sc.close();
	}
}