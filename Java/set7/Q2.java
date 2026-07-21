// 2. Write a program to check if an ArrayList contains a name or not. 

import java.util.*;

class Q2
{
    public static void main(String[]args)
    {
        ArrayList<String> n=new ArrayList<String>();
        n.add("Ayan");
        n.add("Mansory");
        n.add("Urus");
        n.add("SE");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name that you want to search: ");
        String name=sc.nextLine();
        if(n.contains(name))
        {
            System.out.println("ArrayList contains "+name);
        }
        else
        {
            System.out.println("ArrayList doesn't contains "+name);
        }
    }
}