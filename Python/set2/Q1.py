# 1. Write a program which takes the number of days as input & convert it into years,
# months, weeks, & days (hint: consider 365 days for a year, 30 days for a month ). 

day=int(input("Enter number of days:"))
yr=int(day/365)
rem=int(day%365)
mon=int(rem/30)
day=int(rem%30)
print(yr,"yrs",mon,"months and",day,"days")