// Write a program to take a string and convert it in Integer and vice versa using wrapper class

import java.util.*;

class Q3
{
    public static void main(String[]args)
    {
        String snum= "1234";
        System.out.println("String number: "+snum);
        int num=Integer.parseInt(snum);
        System.out.println("Integer: "+num);
        num+=10;
        String s=Integer.toString(num);
        System.out.println("String number: "+s);
    }
}