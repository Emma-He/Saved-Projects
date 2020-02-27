
import java.util.Scanner;

public class PercentageGradeTester {
	
	public static void main(String[] args)
	{
		System.out.println("What did you get on your test?");
		Scanner s1 = new Scanner(System.in);
		double top = s1.nextDouble();
		
		System.out.println("What was the test marked out of?");
		double bottom = s1.nextDouble();
		
		PercentageGrade g1 = new PercentageGrade();
		g1.decimal(top,bottom);
		
	}
}
