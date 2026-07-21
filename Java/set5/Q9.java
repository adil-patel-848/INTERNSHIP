//Write a program to illustrate the use of Super keyword to access the data members. 

class Parent
{
    int a=10;
}
class Child extends Parent
{
    void display()
    {
        System.out.println("A in parent class: "+ super.a);
    }
}
class Q9
{
    public static void main(String[]args)
    {
        Child c= new Child();
        c.display();
    }
}