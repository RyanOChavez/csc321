// Ryan Chavez 
// Midterm 1 
// 3/6/25

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		int x = 7;
		int y;

		System.out.println("Guess the number! Please enter a number to see if you are right or wrong.");
		Scanner keyboard = new Scanner(System.in);
		y = keyboard.nextInt();

		if(y > x)
		{
			System.out.println("The number you guessed was too large. You Lose");
		}
		else if (y < x)
		{
			System.out.println("The number you guess was too small. You Lose");
		}
		else
		{
			System.out.println("You guess the number correctly, You WIN A CAR!");
		}

	}
}
	
