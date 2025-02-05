// Ryan Chavez 
// 2/4/25
// Lab 4 - csc321

import java.util.Scanner;

public class rchavez4
{
	public static void main(String[] args)
	{
		int x = 0;

		System.out.println("Please enter a choice");
		System.out.println("1. Morning");
		System.out.println("2. Afternoon");
		System.out.println("3. Day");
		System.out.println("4. Night");

		Scanner keyboard = new Scanner (System.in);
		x = keyboard.nextInt();

		switch(x)
		{
			case 1: 
				System.out.println("You chose option " + x);
				System.out.println("Good Morning! Lets make it a good day");
				break;
			case 2:
				System.out.println("You chose option " + x);
				System.out.println("Halfway day, Time for lunch");
				break;
			case 3:
				System.out.println("You chose option " + x);
				System.out.println("Day is almsot over");
				break;
			case 4:
				System.out.println("You chose option " + x);
				System.out.println("Goodnight! See you tommorow.");
				break;
		}
	}
}

