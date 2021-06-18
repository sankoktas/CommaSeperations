/**
 * This program reads a number between 1,000 and 999,999 from the user and prints it with a comma seperating the thousands. .
 *
 * @author (Fikri San Koktas)
 * @version (12 October 2020)
 */
import java.util.Scanner;
public class KFS_CommaSeperations_Main
{  
     public static void main (String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Please a number between 1,000 and 999,999: "); // prompts the user to enter a number
        int number = in.nextInt();
        System.out.printf("%,d", number);
    }
}
