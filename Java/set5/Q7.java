/* Write a program to find the biggest and smallest of array and access the 
biggest and smallest by assigning to the static data members of other class.*/

class Parent
{
    public static int big;
    public static int small;
}
class Child
{
    void getBS()
    {
    int a[]={45,32,67,23,87,12};
    int max=a[0];
    int min=a[0];
    for(int i=0;i<a.length;i++)
    {
        if(a[i]>max)
        {
            max=a[i];
        }
        if(a[i]<min)
        {
            min=a[i];
        }
    }
    Parent.big=max;
    Parent.small=min;
    }
}
class Q7
{
    public static void main(String[]args)
    {
        Child c= new Child();
        c.getBS();
        System.out.println("Big: "+Parent.big);
        System.out.println("Small: "+Parent.small);
    }
}