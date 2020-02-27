import java.util.Scanner;

public class Palindromes
{
    public static void main(String[] args)
    {
        System.out.println("To check if a word is a palindrome or not, enter in your word down below. \nTo exit the program, enter \"p\" ");
        Scanner s1 = new Scanner(System.in);
        System.out.println("Type in your text: ");
        String text = s1.nextLine();
        Palindromes.isPalindrome(text);
        
        while(!text.equals("q"))
        {
            System.out.println("Type in your text: ");
            String text2 = s1.nextLine();
            if (text2.equals("q"))
            {
                break;
            }
            Palindromes.isPalindrome(text2); 
            text=text2;
        }
        
    }
    
    public static void isPalindrome(String text)
    {
        int count = 0;
        for (int i=0; i<(text.length()/2);i++)
        {
            String a = text.substring (i,i+1);
            String b = text.substring (text.length()-1-i,text.length()-i);
            if (a.equals(b))
            {
                count++;
            }
        }
        if (count == (text.length()/2))
        {
            System.out.println("Your word is a palindrome!");
        } else {
        System.out.println("Not a palindrome :(");
        }
    }
            
}
