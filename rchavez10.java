//Ryan Chavez 
//

import java.util.Scanner;
import java.lang.Math;

public class rchavez10
{
	public static void main(String[] args)
	{
		double height = 0;
		double radius = 0;
		double pi = Math.PI;
		double area = 0;
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter the radius  of a cylinder \n");
		radius = keyboard.nextDouble();
		System.out.print("Enter the height of a cylinder \n");
		height = keyboard.nextDouble();

		area = volume(height, radius, pi);

		System.out.println("The area of the cylinder is : " + area);



	}

	static double volume(double height, double radius, double pi)
	{
		double vol;

		vol = pi * Math.pow(radius,2) * height;

		return vol;
	}
}


