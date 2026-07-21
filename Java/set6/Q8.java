// Write a program to report if mobile number consist of other character than digit using exception

import java.util.Scanner;

class Q8
{
    public static void main(String[]args)
    {
        boolean flag;
        try
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter your mobile number: ");
            long mnum=sc.nextLong();
            flag=true;
        }
        catch(Exception e)
        {
            System.out.println("Exception: Error in mobile number - "+e);
        }
    }
}