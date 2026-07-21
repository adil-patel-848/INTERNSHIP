/* 1) Write a program to find addition of two numbers using a class, which contains 
3 data members and three methods like getdata( ) and findAddition( ) and returnSum(). */

class Q1
{
    public static void main(String[]args)
    {
        Q1 ad1= new Q1();
        ad1.getdata(3,8);
        ad1.findAddition();
        System.out.println("Sum: "+ ad1.returnSum());

    }
    int a,b,sum;
    void getdata(int x,int y)
    {
        a=x;
        b=y;
    }
    void findAddition()
    {
        sum= a+b;
    }
    int returnSum()
    {
        return sum;
    }
}   