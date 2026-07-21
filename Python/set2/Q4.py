# 4.  Write a program to find the simple interest. (SI= PTR/100) 

p=float(input("Enter printcipal amount:"))
t=float(input("Enter time period in years:"))
r=float(input("Enter rate of interest:"))
si=(p*t*r)/100
print("Simple interest:",si)