package ex02photongianan;
import java.util.Scanner;

public class Ex02PhotonGianan {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String choice = "start game";
       int guess = 3;
       int lowerLimit = 0;
       int upperLimit = 10;
       int range = (upperLimit - lowerLimit) + 1;
       
       while (choice.equalsIgnoreCase("start game")){
           int random = (int) Math.floor(Math.random()* range) + lowerLimit;
           System.out.println("Welcome to Higher or Lower! What will you do?");
           System.out.println("- Start Game");
           System.out.println("- Change Settings");
           System.out.println("- End Application");
           System.out.println("Input choice: ");
           choice = sc.nextLine();
           if (choice.equalsIgnoreCase("start game")){
               while (guess > 0){
                    System.out.println("You have " + guess + " guess(es) left. What is your guess?: ");
                    int answer = sc.nextInt();
                    if (answer > random){
                        guess--;
                        System.out.print("Guess lower! ");
                    }
                    else if (answer < random){
                        guess--;
                        System.out.print("Guess higher! ");
                    }
                    else {
                        guess = 0;
                        System.out.println("You got it!");
                        System.out.println("Play again? (Y/N): ");
                        String playAgain = sc.nextLine();
                        if (playAgain.equalsIgnoreCase("Y")){
                            choice = "start game";
                        }
                        else if (playAgain.equalsIgnoreCase("N")){
                            choice = "start game";
                        }
                    }
                    break;
               }
           }
           else if (choice.equalsIgnoreCase("change settings")){
               System.out.println("What is the lower limit of the random number? Input here: ");
               lowerLimit = sc.nextInt();
               System.out.println("What is the upper limit of the random number? Input here: ");
               upperLimit = sc.nextInt();
               System.out.println("How many guesses are allowed? Input here: ");
               guess = sc.nextInt();
               choice = "start game";
               break;
           }
           else if (choice.equalsIgnoreCase("end application")){
               System.out.println("Thank you for playing!");
               break;
           }
       }
    }
    
}
