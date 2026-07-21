// Write a program to illustrate the use of static member function.

class A
{
    static void display()
    {
        System.out.println("This is a static member function");
    }
}
class Q8
{
    public static void main(String[]args)
    {
        A a=new A();
        a.display();
    }
}