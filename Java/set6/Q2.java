// Write a program to illustrate the use of interface

interface Inter
{
    public void add(int a,int b);
}
class Test implements Inter
{
    public void add(int a,int b)
    {
        System.out.println("Sum: "+(a+b));
    }
}
class Q2
{
    public static void main(String[]args)
    {
        Test t=new Test();
        t.add(4,6);
    }
}