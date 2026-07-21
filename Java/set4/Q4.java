// 4) Program to find the mean of an array by sending to a class with no data member and one member function called getMean()

class Q4
{
    public static void main(String[]args)
    {
        Q4 avg= new Q4();
        int a[]={45,65,23,87,78};
        System.out.println("Mean: "+avg.getMean(a));
    }
    float getMean(int x[])
    {
        int i, sum=0;
        float mean;
        for(i=0;i<x.length;i++)
            sum+=x[i];
        mean= sum/x.length;
        return mean;
    }
}