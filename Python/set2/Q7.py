# 7. Write a program to find the area of triangle when three points are given.  

import math

x1,y1=5,7
x2,y2=9,2 
x3,y3=2,0

ab=math.sqrt((math.pow((x1-x2),2))+(math.pow((y1-y2),2)))
bc=ab=math.sqrt((math.pow((x2-x3),2))+(math.pow((y2-y3),2)))
ca=ab=math.sqrt((math.pow((x3-x1),2))+(math.pow((y3-y1),2)))

s=(ab+bc+ca)/2
a=math.sqrt(s*(s-ab)*(s-bc)*(s-ca))
print("Area:",a)