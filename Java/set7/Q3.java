// 3. Write a program to find the biggest & smallest of integers from an ArrayList. 

import java.util.*;

class Q3
{
    public static void main(String[]args)
    {
        ArrayList<Integer> list= new ArrayList<Integer>();
        list.add(4);
        list.add(8);
        list.add(2);
        list.add(9);

        int b=list.get(0);
        int s=list.get(0);
        for(int i=1;i<list.size();i++)
        {
            if(list.get(i)>b)
                b=list.get(i);
            if(list.get(i)<s)
                s=list.get(i);
        }
        System.out.println("Big: "+b);
        System.out.println("Small: "+s);
    }
}