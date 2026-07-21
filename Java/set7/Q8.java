// 8. Write a program to find the frequency of the names in an ArrayList. 

import java.util.*;

class Q8
{
    public static void main(String[]args)
    {
        ArrayList<String> a= new ArrayList<String>();
        a.add("Porche");      
        a.add("Mansory");      
        a.add("Lamborghini");      
        a.add("Urus");
        a.add("Mansory");      
        a.add("Lamborghini");
        a.add("Porche");      

        ArrayList<String> a2= new ArrayList<String>();
        a2.addAll(a);

        HashSet<String> hs=new HashSet<String>();
        hs.addAll(a);

        a.clear();
        a.addAll(hs);

        ArrayList<Integer> frequency=new ArrayList<Integer>();
        
        for(int i=0;i<a.size();i++)
        {
            String name=a.get(i);
            int count=0;
            for(int j=0;j<a2.size();j++)
            {
                if(name.equals(a2.get(j)))
                {
                    count++;
                }
            }
            System.out.println("Frequency of "+a.get(i)+" is: "+count);
        }

    }
}