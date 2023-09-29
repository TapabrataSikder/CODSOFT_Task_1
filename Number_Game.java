import java.util.Scanner;
import java.util.Random;
public class Number_Game {
	public static void guessingNumberGame()
	{
		Scanner sc = new Scanner(System.in);
        Random rand= new Random();
		int number = rand.nextInt(100);
		int trials = 8;
		int i, guess_number;
        int k=trials;
		System.out.println("Guess a number between 1 to 100.");
        System.out.printf("You have %d chances to guess the correct number!", trials);
		for (i = 0; i < k; i++) 
        {
			System.out.print("\nGuess the number: ");
			guess_number = sc.nextInt();
			
			if (number == guess_number) {
				System.out.printf("Congratulations! You guessed the correct number in %d attempts!\n", (8-trials)+1);
				break;
			}
			else if (number > guess_number ) {
				System.out.printf("The number is greater than %d. ", guess_number);
				System.out.printf("You are left with %d attempts.", trials-1);
			}
			else if (number < guess_number ) {
				System.out.printf("The number is lesser than %d. ", guess_number);
				System.out.printf("You are left with %d attempts.", trials-1);
			}
            trials--;
		}
        
		if (i == k) {
			System.out.println("\nSorry! You have expired with all your attempts.");

			System.out.println("The number was: " + number);
		}
	}
     
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n;
		do{
			
			guessingNumberGame();
			System.out.println("If you want to play again press 1 or else press 0 to exit!");
			
			n=sc.nextInt();
		}
			while(n==1);
				
			
	
        
		

	}
}
