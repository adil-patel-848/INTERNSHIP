// Write a program to add the basic datatypes elements in ArrayList and print it all once

import java.util.*;

class Q10
{
    public static void main(String[]args)
    {
        ArrayList<Object> al=new ArrayList<Object>();
        al.add(1);
        al.add(true);
        al.add(1234);
        al.add(1234567890);
        al.add(12.5);
        al.add(12.578);
        al.add("Ayan");
        al.add("A");

        System.out.println("ArrayList: "+al);
    }
}