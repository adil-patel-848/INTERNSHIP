// 8) Write a program to find the sum of Array Elements and return it to the main function. 

class Q8
{
    public static void main(String[]args)
    {
        int a[]={98,76,64,34,67,38};
        System.out.println("Sum of array:"+getSum(a));
    }
    static int getSum(int x[])
    {
        int sum=0;
        for(int i=0;i<x.length;i++)
        {
            sum=sum+x[i];
        }
        return sum;
    }
}