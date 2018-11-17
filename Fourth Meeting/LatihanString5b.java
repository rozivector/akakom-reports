public class LatihanString5b
{
	public static void main(String[] args)
	{
	String str = "Using String replace to replace character";
	String newStr = str.replace("r", "R");
	System.out.println(newStr);
	String newFirstStr = str.replaceFirst("re", "RE");
	System.out.println(newFirstStr);
	}
}