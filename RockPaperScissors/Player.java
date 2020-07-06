import java.util.Scanner;
import static java.lang.System.*;

public class Player {
    private String name;// Represents the Players name
    Scanner sc = new Scanner(System.in);
    // sc will help to take inputs from keyboard
    private int userpick=0;
 
    public String getName() {
     return name;
    }
 
    public void setName(String n) {
   name = n;
    }
 
    public void askName() {// Will let the user enter his name
      out.println("What is your name?");
      setName(sc.nextLine());
      
    }
    
 
    public int getInput() {
        // This function lets the user do the selection among
        // ROCK PAPER SCISSORS
        // and return what has been selected
       out.println("Select ROCK[1] PAPER[2] SCISSOR[3]");
       int choice = sc.nextInt();
        
         return choice;
    }
 
    public boolean playAgain() {
        // This function will ask if the user wants to
        // play again and return true or false accordingly.
        boolean boo;
        String text1 = "Do u want to play again?";
        if(sc.next().toLowerCase().equals("y")){
        boo = true;
        } else {
        boo = false;
        }
        return boo;
    }
    
        //This function will help to display who selected what
    public void display(String who, int s) {
      
      System.out.println ("You picked something");
        
    }
    //This function contains the actual buisness logic
    //and help to decide who won
    public int compareSelections(int computerinput) {
       int x = computerinput;
       
       
        return 0;
    }
}