public class TypeOfDay 
{
	public static void main(String[] args)
	{
	String typeOfDay = "";
	String dayOfWeekArgs = "Thursday";
	switch (dayOfWeekArgs)
		{
		case "Monday": typeOfDay = "Start of work week";
		break;
		case "Tuesday": case "Wednesday" : case "Thursday" : typeOfDay = "Midweek";
		break;
		case "Friday": typeOfDay = "End of work week";
		break;
		default : System.out.println("Invalid");
		}
	System.out.println(typeOfDay);
	}
}