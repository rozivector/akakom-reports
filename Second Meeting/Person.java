public class Person
{
	public static void main(String[] args)
	{
	int ageYears=19;
	int ageDays=ageYears*365;
	long ageSeconds=ageYears*365*24L*60*60;
	System.out.println("You are "+ageDays+" days old.");
	System.out.println("You are "+ageSeconds+" seconds old.");
	}
}