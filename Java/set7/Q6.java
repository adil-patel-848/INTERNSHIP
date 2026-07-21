// 6. Write a program to remove the elements from a String ArrayList using the index and value. 

import java.util.*;

class Q6
{
    public static void main(String[]args)
    {
        ArrayList<String> s=new ArrayList<String>();
        s.add("BMW");
        s.add("Mansory");
        s.add("Lamborghini");
        s.add("Urus");
        s.add("se");

        System.out.println("Original ArrayList: "+s);
        System.out.println("Removed: "+s.get(0));
        s.remove(0);
        System.out.println("New ArrayList: "+s);
    }
}