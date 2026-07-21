// Write a program to take a string and convert it in long and vice versa using wrapper class

import java.util.*;

class Q6
{
    public static void main(String[]args)
    {
        String snum= "9101";
        System.out.println("String number: "+snum);
        long num=Long.parseLong(snum);
        System.out.println("Long: "+num);
        num+=10;
        String s=Long.toString(num);
        System.out.println("String number: "+s);
    }
}