// 3) Write a program to find the biggest and smallest numbers in an Array. 

class Q3
{
    public static void main(String[]args)
    {
        int a[]={12,34,56,67,78,98,43};
        int small=a[0];
        int big=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>big)
            {
                big=a[i];
            }
            if(a[i]<small)
            {
                small=a[i];
            }
        }
        System.out.println("Big: "+big+"\nSmall: "+small);
    }
}