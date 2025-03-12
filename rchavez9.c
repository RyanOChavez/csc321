//Ryan Chavez 
//

#include<stdio.h>
#include<stdlib.h>
#include<time.h>

int main(void)
{
	int guess = -1, i, y;

	srand(time(NULL));

	y = rand() %20;
	
	
	while(guess < 0 || guess > 20)
	{
		printf("Enter a number between 1 and 20\n");
		scanf("%d", &guess);
		if(guess < 0 || guess > 20)
		{
			puts("Number out of range! Please re-enter a number: ");
			scanf("%d", &guess);
		}
		if (guess < y)
                {
                 	for (i = 0; i < guess; i++)
        		{
		 	printf("You lost and your guess is lower than my number %d\n", y);
               		}
		}
                if (guess > y)
                {
			for (i = 0; i < guess; i++)
       			 {	
                         printf("You lost and your guess is higher than my number %d\n", y);
			 }
                }
                if(guess == y)
		{
			for (i = 0; i < guess; i++)
        		{
                        printf("YOU WON!");
			}
		}
	}

	return EXIT_SUCCESS;
}

