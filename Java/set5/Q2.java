/* Write a program to find the sum of two integer where one integer is inherited from the 
super class and other from the sub class (Use member function to load the data to the object) */

class Parent
{
    int a;
    void load(int x)
    {
        a=x;
    }
}
class Child extends Parent
{
    int b;
    void sload(int x)
    {
        b=x;
    }
    void sum()
    {
        System.out.println("Sum: "+(a+b));
    }
}
class Q2
{
    public static void main(String[]args)
    {
        Child c=new Child();
        c.load(6);
        c.sload(8);
        c.sum();
    }
}