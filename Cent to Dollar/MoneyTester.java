import java.util.Scanner;

public class MoneyTester {
	
	public static void main(String[] args)
	{
		System.out.print("Amount of money in cents: ");
		Scanner s1 = new Scanner(System.in);
		int cent = s1.nextInt();
		
			int hundred = 10000;
			if (cent>=hundred)
			{
				int n1 = cent/hundred;
				cent = cent%hundred;
				System.out.print(n1+" hundred dollar bills");
			} 
			
			int fifty = 5000;
			if (cent>=fifty)
			{
				int n2 = cent/fifty;
				cent = cent%fifty;
				System.out.print(n2 +" fifty dollar bills, ");
		}
			
			int twenty = 2000;
			if (cent>=twenty)
			{
				int n3 = cent/twenty;
				cent=cent%twenty;
				System.out.print(n3 + " twenty dollar bills, ");
			}
			
			int ten = 1000;
			if (cent>=ten)
			{
				int n4 = cent/ten;
				cent=cent%ten;
				System.out.print(n4 + " ten dollar bills, ");
			}
			
			int five = 500;
			if (cent>=five)
			{
				int n5 = cent/five;
				cent=cent%five;
				System.out.print(n5 + " five dollar bills, ");
			}
			
			int toonie = 200;
			if (cent>=toonie)
			{
				int n6 = cent/toonie;
				cent=cent%toonie;
				System.out.print(n6 + " toonies, ");
			}
			
			int loonie = 100;
			if (cent>=loonie)
			{
				int n7 = cent/loonie;
				cent=cent%loonie;
				System.out.print(n7 + " loonies, ");
			}
			
			int quarter = 25;
			if (cent>=quarter)
			{
				int n8 = cent/quarter;
				cent=cent%quarter;
				System.out.print(n8 + " quarters, ");
			}
			
			int dime = 10;
			if (cent>=dime)
			{
				int n9 = cent/dime;
				cent=cent%dime;
				System.out.print(n9 + " dimes, ");
			}
			
			int nickel = 5;
			if (cent>=nickel)
			{
				int n10 = cent/nickel;
				cent=cent%nickel;
				System.out.print(n10 + " nickels, ");
			}
			
			int penny = 1;
			if (cent>=penny)
			{
				int n11 = cent/penny;
				cent=cent%penny;
				System.out.println( n11 + " pennies.");
			}

	}
}
