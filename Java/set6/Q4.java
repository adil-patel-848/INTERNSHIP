// Write a program to take a string and convert it in double and vice versa using wrapper class

import java.util.*;

class Q4
{
    public static void main(String[]args)
    {
        String snum= "5678";
        System.out.println("String number: "+snum);
        double num=Double.parseDouble(snum);
        System.out.println("Double: "+num);
        num+=10;
        String s=Double.toString(num);
        System.out.println("String number: "+s);
    }
}