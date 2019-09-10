import java.util.*;

public class OddsAndEvens {
    public static void main(String [] args){
        String playerName;
        String playerInput;
        int playerFingers, computerFingers;
        Scanner input;
        boolean validInput = false;
        boolean playerEven = false;
        /*
        Add a println that produces the following output:
        Let’s play a game called “Odds and Evens”
         */

        System.out.println("Let’s play a game called \"Odds and Evens\"");

        /*
        Ask the user for their name and then use a scanner to let them type their name into the consol.
        What is your name?
         */

        System.out.print("What is your name? ");

        input = new Scanner(System.in);
        playerName = input.nextLine();

        /*
        Now greet the user and ask them to choose either odds or evens.
        Use a scanner to let them type in either "O" or "E".
        Hi name, which do you choose? (O)dds or (E)vens?
        */
        while(!validInput)
        {
            System.out.print("Hi " + playerName + " which do you choose? (O)dds or (E)vens? ");
            playerInput = input.nextLine();

            if (playerInput.equalsIgnoreCase("O")) {
                validInput = true;
                System.out.println(playerName + " has picked odds! The computer will be evens.\n");
                playerEven = false;
            } else if (playerInput.equalsIgnoreCase("E")) {
                validInput = true;
                System.out.println(playerName + " has picked evens! The computer will be odds.\n");
                playerEven = true;
            } else {
                System.out.println("User input error");
            }
        }

        System.out.println("--------------------------------------");

        /*
        Ask the user how many "fingers" they are going to play, and let them enter in a number.
        How many “fingers” do you put out?
        */

        System.out.print("How many \"fingers\" do you put out? ");
        playerFingers = input.nextInt();
        Random rand = new Random();
        computerFingers = rand.nextInt(6);
        System.out.println("The computer plays "+computerFingers+" \"fingers\".");
        System.out.println("--------------------------------------\n");


        int gameSum = playerFingers + computerFingers;
        System.out.println(playerFingers + " + "+ computerFingers + " = "+ gameSum);
        System.out.print(gameSum);
        boolean oddOrEven = gameSum % 2 == 0;
        //oddOrEven will be true if sum us even, it will be false if sum is odd.
        if(!oddOrEven){
            System.out.println(" is ...odd!");
            if(playerEven==false){
                //Player Wins
                System.out.println("Player Wins");
            }else{
                //Computer Wins
                System.out.println("Computer Wins");
            }
        }else{
            System.out.println(" is ...even!");
            if(playerEven){
                //Player Wins
                System.out.println("Player Wins");
            }else{
                //Computer Wins
                System.out.println("Computer Wins");
            }
        }
    }
}
