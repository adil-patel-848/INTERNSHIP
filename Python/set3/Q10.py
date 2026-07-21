# 10. Write a program to estimate the mean and standard deviation ranges for the percentage to be obtained by a college.  

import math
per=[81,90,92,88,89]
sum=0
for i in range(len(per)):
    sum=sum+per[i]
mean=sum/len(per)
print(mean)

num=0
for i in range(len(per)):
    a=per[i]-mean
    a**2
    num=abs(num+a)

print(num)
delta=math.sqrt(abs(num/len(per)))
print(delta)

print("Pridection of college average will range between",mean-delta,"to",mean+delta)
