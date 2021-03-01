package entities;

public class Calculate {
	
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
}
