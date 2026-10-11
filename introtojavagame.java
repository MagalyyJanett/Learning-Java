import java.util.Scanner;

public class introjavagame {
  public static void main(String[] args) {

  // starting with the scanner
  Scanner input = new Scanner(System.in);

  // inserting the rematch loop
  String rematch = "yes";

    while (rematch.equalsIgnoreCase("yes")) {

    // my welcome msg and players input line
    System.out.println("Welcome to Rock, Paper, Scissors, Lizard, Spock! >:)");
    System.out.println("Make your move: ");
    String playerChoice = input.nextLine();

    // here are my working string values and what happens when anything else is entered
    while (!playerChoice.equalsIgnoreCase("Rock") &&
           !playerChoice.equalsIgnoreCase("Paper") &&
           !playerChoice.equalsIgnoreCase("Scissors") &&
           !playerChoice.equalsIgnoreCase("Spock") && 
           !playerChoice.equalsIgnoreCase("Lizard")) 
    { System.out.println("Invalid. Try again!");
      playerChoice = input.nextLine(); }

    // here I am inserting the math random operator
    int randNum = (int) (Math.random() * 5) + 1;
    String computerChoice;

    // assigning each random number to one of my strings/valid user inputs
    if (randNum == 1) { computerChoice = "spock"; } 
    
    else if (randNum == 2) { computerChoice = "lizard"; } 
      
    else if (randNum == 3) { computerChoice = "scissors"; }
    
    else if (randNum == 4) { computerChoice = "paper"; } 
    
    else { computerChoice = "rock"; }

      
    // establishing my tie before the nitty gritty
    if (playerChoice.equalsIgnoreCase(computerChoice)) 
    {
      System.out.println("The computer chooses: " + computerChoice);
      System.out.println("Tie!");
    }

      
    // possibilities for spock
    else if (playerChoice.equalsIgnoreCase("spock") &&
             (computerChoice.equalsIgnoreCase("scissors") ||
              computerChoice.equalsIgnoreCase("rock"))) {
      System.out.println("The computer chooses: " + computerChoice);
      System.out.println("You win!");
    } else if (playerChoice.equalsIgnoreCase("spock") && 
               (computerChoice.equalsIgnoreCase("paper") ||
                computerChoice.equalsIgnoreCase("lizard"))) 
    { 
      System.out.println("The computer chooses: " + computerChoice);
      System.out.println("You lose!"); 
    }


    // possibilities for lizard
    else if (playerChoice.equalsIgnoreCase("lizard") &&
             (computerChoice.equalsIgnoreCase("paper") ||
             computerChoice.equalsIgnoreCase ("spock"))) 
    { System.out.println("The computer chooses: " + computerChoice);
     System.out.println("You win!");
       } else if (playerChoice.equalsIgnoreCase("lizard") && 
                  (computerChoice.equalsIgnoreCase("scissors") ||
                   computerChoice.equalsIgnoreCase("rock"))) {
      System.out.println("The computer chooses: " + computerChoice);
      System.out.println("You lose!");
    }


    // possibilities for scissors
    else if (playerChoice.equalsIgnoreCase("scissors") &&
             (computerChoice.equalsIgnoreCase("paper") ||
             computerChoice.equalsIgnoreCase("lizard"))) {
      System.out.println("The computer chooses: " + computerChoice);
      System.out.println("You win!");
    } else if (playerChoice.equalsIgnoreCase("scissors") &&
               (computerChoice.equalsIgnoreCase("rock") ||
                computerChoice.equalsIgnoreCase("spock"))) {
      System.out.println("The computer chooses: " + computerChoice);
      System.out.println("You lose!");
    }


    // possibilities for paper
    else if (playerChoice.equalsIgnoreCase("paper") &&
             (computerChoice.equalsIgnoreCase("spock") ||
              computerChoice.equalsIgnoreCase("rock"))) {
      System.out.println("The computer chooses: " + computerChoice);
      System.out.println("You win!");
    } else if (playerChoice.equalsIgnoreCase("paper") &&
               (computerChoice.equalsIgnoreCase("scissors") ||
                computerChoice.equalsIgnoreCase("lizard"))) {
      System.out.println("The computer chooses: " + computerChoice);
      System.out.println("You lose!");
    }


    // possibilities for rock
    else if (playerChoice.equalsIgnoreCase("rock") && 
             (computerChoice.equalsIgnoreCase("scissors") ||
              computerChoice.equalsIgnoreCase("lizard"))) {
      System.out.println("The computer chooses: " + computerChoice);
      System.out.println("You win!");
    } else if (playerChoice.equalsIgnoreCase("rock") &&
               (computerChoice.equalsIgnoreCase("paper") ||
                computerChoice.equalsIgnoreCase("spock"))) {
      System.out.println("The computer chooses: " + computerChoice);
      System.out.println("You lose!");
        }

    // asking if user wants a rematch
    System.out.println("Want to play again?");
    System.out.println("yes/no");
    rematch = input.nextLine();

      // if anything other than yes is entered it will end the game
      if (!rematch.equalsIgnoreCase("yes")) { 
      System.out.println("Bye!");
      }
    }
  }
  } 
      
