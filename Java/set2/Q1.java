// 1. Write a program to find the biggest of 3 numbers using ternary operator. 

class Q1
{
    public static void main(String[]args)
    {
        int a=5,b=2,c=9;
        int big = (a>b && a>c)?a:(b>c)?b:c;
        System.out.println(big + " is biggest");    
    }
}