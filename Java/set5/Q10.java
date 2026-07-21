// Write a program to illustrate the use of Super keyword to access the member functions 

class Parent
{
    void displayP()
    {
        System.out.println("This datamember is from parent class");
    }
}
class Child extends Parent
{
    void display()
    {
        super.displayP();
        System.out.println("This datamember is from child class");
    }
}
class Q10
{
    public static void main(String[]args)
    {
        Child c= new Child();
        c.display();
    }
}