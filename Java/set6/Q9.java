// Write a program to find the size of ArrayList

import java.util.*;

class Q9
{
    public static void main(String[]args)
    {
        ArrayList<Integer> num=new ArrayList<Integer>();
        num.add(2);
        num.add(3);
        num.add(6);
        num.add(1);
        num.add(8);
        num.add(9);
        System.out.println(num);
        System.out.println("Size of ArrayList: "+num.size());
    }
}