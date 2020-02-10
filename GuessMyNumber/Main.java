//*******************************************************************
// Main
//
// Guess a number
//
// History:
// 02/08/2020 Initial version (StW)
// 02/09/2020 First working version (StW)
//*******************************************************************
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int randomNumber, lowerLimit, upperLimit, guessNumber=0, tries;
        Scanner in = new Scanner(System.in);

	// get information about the random number range 
        System.out.print("Lower limit of the secret number (press enter for 100): ");
        try {
		lowerLimit = Integer.parseInt(in.nextLine());
	} catch (Exception e) {
		lowerLimit = 0;
	}
        System.out.print("Upper limit of the secret number (press enter for 0): ");
	try {
        	upperLimit = Integer.parseInt(in.nextLine());
	} catch (Exception e) {
		upperLimit = 100;
	}
	// generate the random number with the given boundaries
        randomNumber = (int) (Math.random()*((upperLimit-lowerLimit)+1))+lowerLimit;

        System.out.print("Try to guess the secret number: ");
	do {
		try {
			guessNumber = Integer.parseInt(in.nextLine());
			if (guessNumber==randomNumber){
        			System.out.println("Awesome! You're right. The secret number is " + randomNumber + " ");
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
    }
}
