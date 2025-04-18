// Ryan Chavez 
// Midterm 2
// 4/17/25

#include <stdio.h>
#include <stdlib.h>

void nameLoop(int);

int main(void)
{
	int choice = 0;

	printf("Please enter a number to start a loop! \n");
	scanf("%d",&choice);
	nameLoop(choice);

	return EXIT_SUCCESS;

}

void nameLoop(int choice)
{
	for(int i = 0; i < choice; i++)
	{	
		printf("Ryan Chavez \n");
	}

}
