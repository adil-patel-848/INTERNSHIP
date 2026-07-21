/* Write a program to find sum of two integer where one integer is inherited from the 
super class and other from the sub class (Use constructor to load the data to the object) */

class Parent
{
    int a;
    Parent(int x)
    {
        a=x;
    }
}
class Child extends Parent
{
    int b;
    Child(int x,int y)
    {
        super(x);
        b=y;
    }
    void sum()
    {
        System.out.println("Sum: "+(a+b));
    }
}
class Q3
{
    public static void main(String[]args)
    {
        Child c=new Child(6,8);
        c.sum();
    }
}