/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Colin Mitchell
 */

package ex32;
import java.util.Scanner;

public class App
{
    public static void main(String[] args) {
        System.out.println("Let's play Guess the Number!");

        gameLoop();
    }

    public static void gameLoop() {
        Scanner input = new Scanner(System.in);

        int number;
        int guess;
        int total = 0;
        int key;

        while(true){
            total = 0;

            System.out.print("Enter the difficulty level(1, 2, or  3): ");

            key=input.nextInt();

            if(key == 1) {
                number = (int) (Math.random() * 10 + 1);
            }
            else if(key==2) {
                number = (int) (Math.random() * 100 + 1);
            }
            else {
                number = (int) (Math.random() * 1000 + 1);
            }

            System.out.print("I have my number. What's your guess?: ");

            do{
                guess = input.nextInt();
                total++;

                if (guess == number) {
                    System.out.println("You got it in " + total + " guesses!");
                }
                else if (guess < number) {
                    System.out.print("Too low. Guess again: ");
                }
                else if (guess > number) {
                    System.out.print("Too high. Guess again: ");
                }
            }while (guess != number);

            System.out.print("\nDo you wish to play again (Y/N)? ");
            char choice = input.next().charAt(0);

            if(choice =='N' || choice == 'n') {
                break;
            }
        }
    }
}