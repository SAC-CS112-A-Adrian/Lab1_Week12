import java.util.Scanner;

public class DiceGame {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int numberOfDice;
		int bounces;
		int userGuess;
		int diceRolled;
		int gamesWon = 0;
		int gamesLoss = 0;

		boolean again = true;

		Dice game = new Dice();
		
		while (again) {

			System.out.printf("Enter number of dice: ");
			numberOfDice = input.nextInt();
			
			System.out.printf("Enter number of bounces: ");
			bounces = input.nextInt();

			diceRolled = game.Throw(numberOfDice, bounces);

			System.out.printf("Guess points: ");
			userGuess = input.nextInt();

			if (userGuess == diceRolled)
			{
				System.out.printf("You win! It was %d.\n", diceRolled);
				gamesWon++;
			}
			else
			{
				System.out.printf("You lose! It was %d.\n", diceRolled);
				gamesLoss++;
			}
			
			game.history(gamesLoss, gamesWon);
			
			System.out.printf("\nEnter 1 to play again: ");
			int playAgain = input.nextInt();
			if (playAgain != 1)
				again = false;

		}
	}
}