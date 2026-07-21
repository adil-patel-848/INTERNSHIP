// 5. Write a program to find common elements between two ArrayList for string data. 

import java.util.*;

class Q5
{
    public static void main(String[]args)
    {
        ArrayList<String> s1= new ArrayList<String>();
        ArrayList<String> s2= new ArrayList<String>();
        ArrayList<String> common= new ArrayList<String>();

        s1.add("Ayan");
        s1.add("Adil");
        s1.add("Patel");

        s2.add("Mansory");
        s2.add("Urus se");
        s2.add("BMW");
        s2.add("Ayan");

        for(int i=0;i<s1.size();i++)
        {
            if(s2.contains(s1.get(i)))
            {
                common.add(s1.get(i));
            }
        }
        System.out.println("Common elements are: "+common);
    }
}