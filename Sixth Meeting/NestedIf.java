public class NestedIf
{
	public static void main(String[] args)
	{
	String tvType = "color";
	int size = 16;
	int discPercent = 0;
	if(tvType.equals("color"))
		{
		if(size == 14)
			{
			discPercent = 8;
			}
		else
			{
			discPercent = 10;
			}
		}
	System.out.println("discPercent= "+discPercent);
	}
}