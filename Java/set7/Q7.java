// 7. Write a program to find the unique elements of an Array list using Hashset class. 

import java.util.*;

class Q7
{
    public static void main(String[]args)
    {
        ArrayList<String> s=new ArrayList<String>();
        s.add("BMW");
        s.add("Mansory");
        s.add("Lamborghini");
        s.add("Urus");
        s.add("se");
        s.add("Mansory");
        s.add("Lamborghini");
        s.add("Urus");
        s.add("se");
        s.add("BMW");
        s.add("Mansory");
        s.add("Lamborghini");

        System.out.println("Original ArrayList: "+s);
    
        HashSet<String> hs = new HashSet<String>();
        hs.addAll(s);
        s.clear();
        s.addAll(hs);
        System.out.println("Unique ArrayList: "+s);
    }
}