package ex02photongianan;
import java.util.Scanner;

public class Ex02PhotonGianan {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String choice;
       int guess = 3;
       int lowerLimit = 0;
       int upperLimit = 10;
       int range = (upperLimit - lowerLimit) + 1;
       
       do {
           System.out.println("Welcome to Higher or Lower! What will you do?");
           System.out.println("- Start Game");
           System.out.println("- Change Settings");
           System.out.println("- End Application");
           System.out.println("Input choice: ");
           choice = sc.nextLine();
           switch (choice){
               case "start game":
                   int random = (int) Math.floor(Math.random()*range) + lowerLimit;
                   for (int remaining = guess; guess > 0; guess--){
                       System.out.println("You have " + guess + " guess(es) left. What is your guess? ");
                       int answer = Integer.parseInt(sc.nextLine());
                       if (answer > random){
                           System.out.println("Guess lower!");
                       }
                       else if (answer < random){
                           System.out.println("Guess higher!");
                       }
                       else if (answer == random){
                           System.out.println("You got it!");
                           System.out.println("Play again? (y/n): ");
                           String playAgain = sc.nextLine();
                           if (playAgain.equalsIgnoreCase("y")){
                               choice = "start game";
                               break;
                           }
                           else if (playAgain.equalsIgnoreCase("n")){
                            choice = "end application";
                            System.out.println("Thank you for playing!");
                            break;
                           }
                       }
                       if (guess == 0){
                           System.out.println("You lost!");
                           System.out.println("Play again? (y/n): ");
                           String playAgain = sc.nextLine();
                           if (playAgain.equalsIgnoreCase("y")){
                               choice = "start game";
                           }
                           else if (playAgain.equalsIgnoreCase("n")){
                            choice = "end application";
                            System.out.println("Thank you for playing!");
                            break;
                           }
                       }
                   }
                   break;
               case "change settings":
                    System.out.println("What is the lower limit of the random number? Input here: ");
                    lowerLimit = sc.nextInt();
                    System.out.println("What is the upper limit of the random number? Input here: ");
                    upperLimit = sc.nextInt();
                    System.out.println("How many guesses are allowed? Input here: ");
                    guess = sc.nextInt();
                    break;
               case "end application":
                    System.out.println("Thank you for playing!");
                    break;
            }
       } while (!choice.equalsIgnoreCase("end application"));
    }
    
}
