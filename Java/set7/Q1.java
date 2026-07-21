// 1. Write a program to add only string into ArrayList & print individually by doing it generic. 

import java.util.*;
class Q1
{
    public static void main(String[]args)
    {
        ArrayList<String> s=new ArrayList<String>();
        s.add("Adil");
        s.add("Ayan");
        s.add("BMW");
        s.add("Lamborghini");

        for(int i=0; i<s.size();i++)
        {
            System.out.println(s.get(i));
        }
    }
}