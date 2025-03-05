#Ryan Chavez 


import random 

randNum = random.randint(0,9)

x = 0
y = 0

print("Guess a number between 0 and 9")

y = int(input())
if y > randNum:
    print("The number you guessed is higher than the random number. You lose")
elif y < randNum:
    print("The number you guessed is lower than the random number. You Lose")
else:
    print("The number you guessed is correct! You WIN!")


for i in range(y):
    print("Why coulddn't the man code. Because he couldn't C")

while x < 7:
    print("Chicken Alfredo")
    x = x + 1


