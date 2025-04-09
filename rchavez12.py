# Ryan Chavez 
#4/8/25
# Lab 12 

def rectangle(length, width):
    area = length * width
    return area

x = int(input("Enter the length of a rectangle: "))
y = int(input("Enter the width of a rectangle: "))

rectArea = rectangle(x,y)

print("The area of the rectangle is: ", rectArea)

def circle(radius):
    area = 3.14 *(radius * radius)
    return area 

a = int(input("Enter the radius of a circle: "))

circleArea = circle(a)

print("The area of the circle is: ", circleArea)



