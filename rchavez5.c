//Ryan Chavez
//
//

#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main(void)
{
	int x = 0;
	double alpha = 5;
	float beta = 2.22;
	char omega = 'R';
	int arr[10] = {3, 6, 9, 12, 15, 18, 21, 24, 27, 30};


	printf("the value of x %d and it's address is %p \n",x,&x);
	printf("the value of alpha %lf and it's address is %p \n",alpha, &alpha);
	printf("the value of beta %f and its address is %p \n",beta,&beta);
	printf("the character of omega %c and it's address is %p \n",omega,&omega);
	// scope statement 
	{
		int y = 4;
	}
	
	//printf("the value of y is %d \n",y);

	for(int i = 0; i < 10; i++)
	{
		printf("address of arr[%d] = %p \n",arr[i],&arr[i]);
	}


	return EXIT_SUCCESS;

}
