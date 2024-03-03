//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner; //Import scanner tool for user input

public class Rock_Paper_Scissors
{
    public static void main(String[] args)
    {
        String playerA = ""; //Holds player A input
        String playerB = ""; //Holds player B input
        String playAgain = ""; //Will hold input for is they want to play again.
        String wrong =""; //holds incorrect string inputs
        int bad = 0; //used for number inputs
        Scanner in = new Scanner(System.in); //Creates scanner
        boolean done = false; //keeps loop going
        do
         {
             System.out.println("Player One please select Rock, Paper, or Scissors (R,P,S"); //prompts player A for a selection
             if (in.hasNext())
             {
                 playerA = in.next().toUpperCase(); //Captures input and normalizes to uppercase
                 if (playerA.equals("R")) //uses playerA to route to next selection table
                 {
                     System.out.println("Player Two please select Rock, Paper, or Scissors (R,P,S");
                     if (in.hasNext())
                     {
                         playerB = in.next().toUpperCase(); //Holds playerB choice and normalizes it to uppercase
                         if (playerB.equals("R"))
                         {
                             System.out.println("You both picked Rock! That's a tie!");
                         }
                         else if (playerB.equals("P"))
                         {
                             System.out.println("Paper covers rock! Player B wins!");
                         }
                         else if (playerB.equals("S"))
                         {
                             System.out.println("Rock Smashes Scissors! Player A wins!");
                         }
                         else
                         {
                             System.out.println("Your input wasn't accepted your input is not a valid option"); //This should catch every other use case and send then to the "Do you want to play again" option
                         }

                     }
                 }
                 else if (playerA.equals("P")) //uses playerA to route to next selection table
                 {
                     System.out.println("Player Two please select Rock, Paper, or Scissors (R,P,S");
                     if (in.hasNext())
                     {
                         playerB = in.next().toUpperCase(); //Captures input and normalizes to uppercase
                         if (playerB.equals("R"))
                         {
                             System.out.println("Paper covers rock! Player A wins!");
                         }
                        else  if (playerB.equals("P"))
                         {
                             System.out.println("You both picked Paper! That's a tie!");
                         }
                        else  if (playerB.equals("S"))
                         {
                             System.out.println("Scissors cuts paper! Player B wins!");
                         }
                         else
                         {
                             System.out.println("Your input wasn't accepted your input is not a valid option"); //This should catch every other use case and send then to the "Do you want to play again" option
                         }

                     }
                 }
                else if (playerA.equals("S")) //uses playerA to route to next selection table
                 {
                     System.out.println("Player Two please select Rock, Paper, or Scissors (R,P,S");
                     if (in.hasNext())
                     {
                         playerB = in.next().toUpperCase(); //Captures input and normalizes to uppercase
                         if (playerB.equals("R")) //finds final result
                         {
                             System.out.println("Rock Smashes Scissors! Player A wins!");
                         }
                        else if (playerB.equals("P"))
                         {
                             System.out.println("Scissors cuts paper! Player A wins!");
                         }
                        else if (playerB.equals("S"))
                         {
                             System.out.println("You both picked Scissors! That's a tie!");
                         }
                         else
                         {
                             System.out.println("Your input wasn't accepted your input is not a valid option"); //This should catch every other use case and send then to the "Do you want to play again" option
                         }
                     }
                 }
                 else
                 {
                     System.out.println("Your input wasn't accepted your input is not a valid option"); //This should catch every other use case and send then to the "Do you want to play again" option
                 }
             }
             System.out.println("Do you want to play again? (Y/N)");

             playAgain = in.next().toUpperCase();  //Captures input and normalizes to uppercase

             done = !playAgain.equals("Y");
         }
        while (!done);
    }
}