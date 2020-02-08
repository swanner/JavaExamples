//*******************************************************************
// Main
//
// Guess a number
//
// History:
// 02/08/2020 Initial version (StW)
//*******************************************************************
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Int randomNumber, lowerLimit, upperLimit, guessNumber;
        Scanner in = new Scanner(System.in);
        Random random = new Random(); 

        System.out.print("Lower limit of the secret number (press enter for 100): ");
        lowerLimit = in.nextLine();
        System.out.print("Upper limit of the secret number (press enter for 0): ");
        upperLimit = in.nextLine();
        randomNUmber = random(lowerLimit, upperLimit);
        System.out.print("Try to guess my secret number: ");
        guessNumber = in.nextLine();
        if (guessNumber==radnomNumber) { 
          System.out.println("Awesome! Youŕe right. The secret number is " + randomNumeber + " ");
        }
        else if (guessNumber > randomNumber)
          System.out.println("Nice try, but your guess is too high.");
          System.out.print("Try again: ");
          guessNumber = in.nextLine();
        }
        else if (guessNumber < randomNumber)
          System.out.println("Nice try, but your guess is too low.");
          System.out.print("Try again: ");
          guessNumber = in.nextLine();
        }
    }
}
