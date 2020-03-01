//*******************************************************************
// Main
//
// Guess a number
//
//*******************************************************************
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int randomNumber, lowerLimit, upperLimit, guessNumber=0, tries=0;
        Scanner in = new Scanner(System.in);

	// get information about the random number range 
        System.out.print("Lower limit of the secret number (press enter for 0): ");
        try {
			lowerLimit = Integer.parseInt(in.nextLine());
		} catch (Exception e) {
			lowerLimit = 0;
		}
        System.out.print("Upper limit of the secret number (press enter for 100): ");
		try {
        	upperLimit = Integer.parseInt(in.nextLine());
		} catch (Exception e) {
			upperLimit = 100;
		}

		// generate the random number with the given boundaries
        randomNumber = (int) (Math.random()*((upperLimit-lowerLimit)+1))+lowerLimit;

        System.out.println("Try to guess the secret number. ");
		System.out.println("Hint: The number is somewhere between " + lowerLimit + " and " +  upperLimit + ".");
		do {
			try {
				guessNumber = Integer.parseInt(in.nextLine());
				tries++;
				if (guessNumber==randomNumber){
						System.out.println("Awesome! You're right. It took you " + tries + " tries to find the secret number " + randomNumber + ".");
					break;        	}
					else if (guessNumber > randomNumber){
						System.out.println("Nice try, but your guess is too high.");
						System.out.print("Try again: ");
					}
					else if (guessNumber < randomNumber){
						System.out.println("Nice try, but your guess is too low.");
						System.out.print("Try again: ");
					}
			} catch (Exception e) {
				System.out.print("Enter a real number: ");
			}
		} while (true);
		in.close();	
	}
}
