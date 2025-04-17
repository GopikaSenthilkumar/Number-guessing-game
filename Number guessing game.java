import java.util.Scanner;
import java.util.Random;
class Main
  {
    public static void main(String[] args)
    {
      Scanner reader = new Scanner(System.in);
      String play = "Yes";
      //while loop to determine if we are going to play the game again
      while(play.equals("Yes"))
        {
        Random rand = new Random();
        int randNum = rand.nextInt(100);
        int guess = -1;
        int tries = 0;
        //while loop to check if the game is over
        while(guess != randNum)
          {
            System.out.print("Guess a number between 1 and 100: ");
            guess = reader.nextInt();
            tries++;
            if(guess == randNum)
            {
              System.out.println("You guessed the number!");
              System.out.println("It took you " + tries + " guesses.");
              System.out.println("Would you like to play again? Yes or No: ");
              play = reader.nextLine();
            }
            else if(guess > randNum)
            {
              System.out.println("Your guess is too high, try again.");
            }
            else{
              System.out.println("Your guess is too low, try again.");
            }
          }
        }
      reader.close();
    }
  }
