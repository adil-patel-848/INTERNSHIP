// Write a program to illustrate the use of simple try-catch block

import java.util.Scanner;

class Q7
{
    public static void main(String[]args)
    {
        int a,b;
        try{
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter two number to divide: ");
            a=sc.nextInt();
            b=sc.nextInt();
            System.out.println("Division: "+(a/b));
        }
        catch(Exception e)
        {
            System.out.println("Exception: "+e);
        }
    }
}