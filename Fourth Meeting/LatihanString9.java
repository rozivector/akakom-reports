public class LatihanString9
{
	public static void main(String[] args)
	{
	String s1 = "Susan";
	String s2 = "Susan";
	String s3 = "Robert";
	//Return 0 becoude s1 is identical to s2
	System.out.println(s1.compareTo(s2));
	//Return >0 becoude 'S' follows 'R'
	System.out.println(s1.compareTo(s3));
	//Return <0 becoude 'R' precedes 'S'
	System.out.println(s3.compareTo(s1));
	}
}