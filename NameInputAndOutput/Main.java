//*******************************************************************
// Main
//
// Input and output example.
//
// History:
// 01/12/2020 Initial version
//*******************************************************************
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String firstname, lastname;
        Scanner in = new Scanner(System.in);

        System.out.print("Type your first name: ");
        firstname = in.nextLine();
        System.out.print("Type your last name: ");
        lastname = in.nextLine();
        System.out.println("Your full name is: " + firstname + " " + lastname + " ;-)");
    }
}

