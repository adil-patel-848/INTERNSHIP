// 2) Write a program to find the addition of two numbers by using only object 

class Q2
{
    public static void main(String[]args)
    {
       Q2 sum= new Q2();
       System.out.println("Sum: "+sum.getData(7,2));
    }
    int getData(int x, int y)
    {
        return (x+y);
    }
}