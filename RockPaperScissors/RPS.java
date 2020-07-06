import java.util.Scanner;
import static java.lang.System.*;
import java.util.Random;

public class RPS {
 
    public static void main(String[] args) {
       int numberOfGames=0;
       int playerWins=0;
       int computerWins=0;
       int r = (int) Math.random();
       boolean stop=false;
       Random random = new Random();
       Player player = new Player();


       while (!stop)
        {
          player.askName();

          // Get moves - player and random computer
         int playerinput = player.getInput();
         int computerinput = r*3;
         
        // Compare moves and determine winner
        int compareResult=player.compareSelections(computerinput);
      
        //display result
        
        // Ask the player to play again
        if (player.playAgain()) {
            System.out.println();
            stop=false;
        } else {
          stop=true;
        }
    }
    }


}