# 10.  Write a program to solve this equation (b^2/|c|)+√3A^2+√8B

import math

A,B,b,c=1,4,8,9
fop=math.pow(b,2)/abs(c)
sop=math.sqrt(3*(math.pow(A,2)))
top=math.sqrt(8*B)
sol=fop+sop+top
print(f"Solution:{sol:.3f}")
