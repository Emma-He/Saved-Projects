
public class PercentageGrade {
	
	private double top;
	private double bottom;
	
	public void decimal(double top, double bottom)
	{
		double decimal = top/bottom;
		double quotient = Math.round(decimal*1000)/10.0;
		System.out.println("This is your percentage grade: " + quotient + "%");
	}

}
