public class LatihanIfElse
{
	public static void main(String[] args)
	{
	String forecast;
	double temperature = getTemperature();
	if(temperature <= 32.0)
		{
		forecast = "SNOW";
		System.out.println(forecast);
		}
	else
		{
		forecast = "RAIN";
		System.out.println(forecast);
		}
	}
	public static double getTemperature()
			{
			return 30.3;
			}
}