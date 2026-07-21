// Write a program to take a string and convert it in float and vice versa using wrapper class

import java.util.*;

class Q5
{
    public static void main(String[]args)
    {
        String snum= "9101";
        System.out.println("String number: "+snum);
        float num=Float.parseFloat(snum);
        System.out.println("Float: "+num);
        num+=10;
        String s=Float.toString(num);
        System.out.println("String number: "+s);
    }
}