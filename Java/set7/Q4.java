// 4. Write a program to remove duplicate elements from an ArrayList. 

import java.util.*;

class Q4
{
    public static void main(String[]args)
    {
        ArrayList<Object> al=new ArrayList<Object>();
        al.add("Ayan");
        al.add(34);
        al.add(34);
        al.add("Mansory");
        al.add("Ayan");
        System.out.println("Original ArrayList: "+al);
        
        ArrayList<Object> new_al=new ArrayList<Object>();

        for(int i=0;i<al.size();i++)
        {
            if(new_al.contains(al.get(i)))
            {
                System.out.println("Removed: "+al.get(i));
            }
            else{
                new_al.add(al.get(i));
            }
        }
        System.out.println("New ArrayList: "+new_al);
    }
}