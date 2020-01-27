//*******************************************************************
// Main
//
// Input and output example.
//
// History:
// 01/12/2020 Initial version (StW)
// 01/26/2020 Changed output text (StW)
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
        System.out.println("Hello " + firstname + " " + lastname + ". Nice to meet you ;-)");
    }
}

