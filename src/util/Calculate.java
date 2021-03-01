package util;

public class Calculate {

	public final double PI = 3.14159;
	
	public int comparingTheValueOf_X_And_Y(double X, double Y) 
	{
		if(X > Y)
		{
			return 1;
		}
		else if(X == Y)
		{
			return 2;
		}
		else {
			return 3;
		}
	}
	
	public double circunference(double radius)
	{
		return 2.0 * PI * radius;
	}
	
	public double volume(double radius)
	{
		return 4.0 * PI * radius* radius* radius / 3.0;
	}
}
