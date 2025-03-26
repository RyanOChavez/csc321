// Ryan Chavez 
// 3/23/25
// Lab 11


#include <stdio.h>
#include <stdlib.h>
#include <math.h>

double  hypotenuseTriangle (int, int);

int main(void)
{
	int base = 0;
	int height = 0;
	double result;

	printf("Calculating the hypotenuse of a right triangle \n");
	printf("Enter the base of a right triangle: ");
	scanf("%d", &base);
	printf("Enter the height of a right triangle: ");
        scanf("%d", &height);
	
	result = hypotenuseTriangle(base,height);
	printf("The hypotenuse of the right triangle is: %lf \n", result);
	
	return EXIT_SUCCESS;

}

double  hypotenuseTriangle (int base, int height)
{
	double hyp = hypot(base,height);
	return hyp;
}
