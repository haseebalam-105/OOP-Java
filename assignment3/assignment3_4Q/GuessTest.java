public class GuessTest
{
	public static void main(String[] args)
	{
		GuessTheWord.levelOne("apple","anar","mango");
		
		if(GuessTheWord.score >= 10)
		{
			GuessTheWordLevelTwo.levelTwo();
		}
		else if(GuessTheWord.score < 10)
		{
			System.out.print("Sorry! You need at least 10 score for level 2");	
		}
	}
}