public class TrackingGoal
{
	public static void main(String[] args)
	{
	int numberOfGoals = 5;
	String s;
	if(numberOfGoals == 1)
		{
		s = "goal";
		}
	else
		{
		s = "goals";
		}
	System.out.println("I scored "+numberOfGoals+" "+s);
	}
}