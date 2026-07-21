// Write a program to illustrate the use of abstract class

abstract class abs
{
    abstract void greet(String name); 
}
class Test extends abs
{
    void greet(String name)
    {
        System.out.println("Hello "+name);
    }
}
class Q1
{
    public static void main(String[]args)
    {
        Test t=new Test();
        t.greet("Ayan");
    }
}