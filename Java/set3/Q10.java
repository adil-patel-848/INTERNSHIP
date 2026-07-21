/* 10) Write a program to check whether a given array elements are sorted in ascending order or not by sending 
the array to a function and return a Boolean value accordingly to main. */

class Q10
{
    public static void main(String[]args)
    {
        int a[]={56,78,13,87,31,98};
        int b[]={12,34,56,78,90};
        boolean checka= checkOrder(a);
        boolean checkb= checkOrder(b);
        System.out.println("Is array 'a' ascending: "+checka);  // false
        System.out.println("Is array 'b' ascending: "+checkb);  // true
    }
    static boolean checkOrder(int x[])
    {
        boolean check=true;
        for(int i=0;i<x.length-1;i++)
        {
            if(x[i]>x[i+1])
            {
                check=false;
                break;
            }
        }
        return check;
    }
}