# 8.  Write a program to solve this equation ((a+b)/(x+y))^(1/(x+y))

import math

a,b,x,y=3,6,9,2
n=a+b
d=x+y
eq=n/d
p=1/(x+y)
sol=math.pow(eq,p)
print(f"Solution: {sol:.2f}")