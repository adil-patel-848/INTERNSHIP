# 9.  Write a program to solve this equation (√(m+n+p)/((a+b+c)/(m+n)))^(x+y)

import math

m,n,p,a,b,c,x,y=7,5,2,7,2,9,8,3
n=math.sqrt(m+n+p)
d=(a+b+c)/(m+n)
p=x+y
eq=n/d
sol=math.pow(eq,p)
print("Solution:",sol)

