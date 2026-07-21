// 4) Write a program to find sum of two integers for function with arguments and with returning values. 

class Q4
{
    public static void main(String[]args)
    {
        int a=3,b=7;
        System.out.println("Sum: "+ getSum(a,b));
    }
    static int getSum(int x,int y)
    {
        int sum;
        sum=x+y;
        return sum;
    }
}