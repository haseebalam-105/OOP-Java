import java.util.Scanner;

public class GuessTheWord
{
	public static int score ;
 	
	public static void levelOne(String word1,String word2,String word3)
	{
		Scanner input = new Scanner(System.in);
		
		for(int i=0;i<3;i++)
		{
			System.out.print("Enter the word to guess: ");
			String guess1 = input.nextLine();
			input.nextLine();
			
			if(guess1==word1)
			{
				score -=1;
			}
			else if(guess1 == word2)
			{
				score += 10;
			}
			else if(guess1 == word3)
			{
				score += 1;
			}
		}
	}
}