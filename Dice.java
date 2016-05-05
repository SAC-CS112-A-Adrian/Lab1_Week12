
public class Dice {
	
	private int maximum;
	private int numberOfThrows;
	private int diceRolled;
	
	public Dice ()
	{
		maximum = 6;
		numberOfThrows = 0;
	}
	
	public int Throw(int dices)
	{
		numberOfThrows++;
		int max = maximum * dices;
		return ( 1 + (int) (Math.random() * max) );
	}
	
	public int Throw (int dices, int bounces)
	{
		numberOfThrows++;
		int max = maximum * dices;
		return ( 1 + (int) (Math.random() * max) ) * bounces;
		
	}
	
	public int rollDice (int number)
	{
		numberOfThrows++;
		int max = maximum * number;
		diceRolled = ( 1 + (int) (Math.random() * max) );
		return diceRolled;
	}
	
	public void gamesLossWon(int loss, int won)
	{
		System.out.printf("Games loss: %d\nGames won: %d\n", loss, won);
	}
	
	public void numberThrows()
	{
		System.out.printf("Number of throws: %d\n", numberOfThrows);
	}
	
	public void history(int loss, int won)
	{
		System.out.printf("Number of throws: %d\n", numberOfThrows);
		System.out.printf("Games loss: %d\tGames won: %d\n", loss, won);
	}
	
	
}
