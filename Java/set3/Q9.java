// 9) Write a program to find the mean of element of an array and return it to the main function. 

class Q9
{
    public static void main(String[]args)
    {
        int a[]={98,76,64,34,67,38};
        System.out.println("Mean of array:"+getMean(a));
    }
    static float getMean(int x[])
    {
        int sum=0;
        for(int i=0;i<x.length;i++)
        {
            sum=sum+x[i];
        }
        return sum/x.length;
    }
}