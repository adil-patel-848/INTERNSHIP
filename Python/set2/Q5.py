# 5. Write a program to find the distance between the two points in Cartesian coordinate system

import math
x1=float(input("Enter co-ordinates of x1"))
y1=float(input("Enter co-ordinates of y1"))
x2=float(input("Enter co-ordinates of x2"))
y2=float(input("Enter co-ordinates of y2"))

dist=math.sqrt((math.pow((x1-x2),2))+(math.pow((y1-y2),2)))
print("Distance:",dist)