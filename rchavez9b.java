// Ryan Chavez 
// lab 9 java 
// 3/11/25

import java.util.Scanner;
import java.util.Random;

public class rchavez9b
{
	public static void main(String[] args)
	{
		int guess = -1;
		int i;
		int y;
		
		Random rand = new Random();

		y = 1 + rand.nextInt(20);

		while (guess < 0 || guess > 20)
		{
			System.out.println("Please Enter a number between 1-20\n");
			Scanner keyboard = new Scanner(System.in);
			guess = keyboard.nextInt();
			if(guess < 0 || guess > 20)
			{
				System.out.println("ERROR! Number is out of range! Please re-enter a number:\n");
				guess = keyboard.nextInt();
			}
			if(guess < y)
			{
				for(i = 0; i < guess; i++)
				{
					System.out.println("You lost and your guess was lower than my number " + y + "\n");
				}
			}
			else if(guess > y)
                        {
                                for(i = 0; i < guess; i++)
                                {
                                        System.out.println("You lost and your guess was higher than my number " + y + "\n");
                                }
                        }
			else
                        {
                                for(i = 0; i < guess; i++)
                                {
                                        System.out.println("You guessed correctly!!!\n");
                                }
                        }
		}
	}
}


