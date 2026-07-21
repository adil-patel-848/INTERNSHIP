# 10. Write a program which takes the number of seconds as input & convert it into hours, minutes and seconds. 

sec=4000
hr=int(sec/3600)
r=sec%3600
minute=int(r/60)
sec=r%60
print(hr,"hrs",minute,"mins",sec,"seconds")