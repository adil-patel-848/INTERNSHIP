# 6. Write a program to find the area of triangle when three sides are given. (Hint: use heron’s equation  

import math

a,b,c=6,5,4
s=(a+b+c)/2
a=math.sqrt(s*(s-a)*(s-b)*(s-c))
print("Area:",a)