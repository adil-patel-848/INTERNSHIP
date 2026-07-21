/* 10. Write a program  to sort  double dimension Arraylist in descending order based on 
 percentage which contains attributes like  name , rollno and percentage. */

 import java.util.*;

class Q9
{
    public static void main(String[]args)
    {
        ArrayList<Object> row1=new ArrayList<Object>();
        row1.add(111);
        row1.add("Ayan");
        row1.add("89.99");

        ArrayList<Object> row2=new ArrayList<Object>();
        row2.add(222);
        row2.add("Adil");
        row2.add("95.99");

        ArrayList<Object> row3=new ArrayList<Object>();
        row3.add(333);
        row3.add("Patel");
        row3.add("99.99");

        ArrayList<Object> row4=new ArrayList<Object>();
        row4.add(444);
        row4.add("Ayanman");
        row4.add("100.00");

        ArrayList<Object> f=new ArrayList<Object>();
        f.add(row1);
        f.add(row2);
        f.add(row3);
        f.add(row4);

        System.out.println("ArrayList before sorting:");
        for(int i=0;i<f.size();i++)
        {
            System.out.println("Inner List at "+i+": "+f.get(i));
        }

        ArrayList<Object> row5=new ArrayList<Object>();
        row5.add(row1.get(0));

        for(int i=0;i<row1.size();i++)
        {
            for(int j=i+1;j<row1.size();j++)
            {
                if(row5.get(i.percentage)<row1.get(j.percentage))
                {
                    ArrayList<Object> temp=new ArrayList<Object>();
                    temp.add(row5.get(i));
                    row5.set(i,row1.get(j));
                    row1.set(j,temp(0));
                    temp.clear();
                }
            }
        }

        System.out.println(row5);

    }
}