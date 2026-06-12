// 3. Write a program to add 100 to a number if it is even and print the resulted number otherwise print the number as it is.

class Q3
{
    public static void main(String[]args)
    {
        int num= 10;
        if(num%2==0)
        {
            num+=100;
            System.out.println("Its even : "+ num);
        }
        else
        {
            System.out.println("Its odd : "+num);
        }
    }
}