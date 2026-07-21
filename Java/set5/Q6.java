/* Write a program to create 3 classes which contains one data member and one member function to get the data. 
Inherit all classes in multilevel manner into a 3rd class to find the Average of these numbers. 
And inherit the Second class into another 4th class to form Hierarchical inheritance to find the biggest among them. */

import java.util.Scanner;

class A 
{
    Scanner sc = new Scanner(System.in);
    int fno;
    void getFno()
    {
        System.out.print("Enter first number: ");
        fno=sc.nextInt();
    }
}
class B extends A
{
    int sno;
    void getSno()
    {
        super.getFno();
        System.out.print("Enter second number: ");
        sno=sc.nextInt();
    }
}
class C extends B
{
    int tno;
    void getTno()
    {
        super.getSno();
        System.out.print("Enter third number: ");
        tno=sc.nextInt();
    }
    void avg()
    {
        int a= (fno+sno+tno)/3;
        System.out.println("\nAverage: "+a);
    }

}
class D extends B  
{
    void big(C x)
    {
        if(x.fno>x.sno && x.fno>x.tno)
        {
            System.out.println(x.fno+" is bigger");
        }
        else if(x.sno>x.fno && x.sno>x.tno)
        {
            System.out.println(x.sno+" is bigger");
        }
        else
        {
            System.out.println(x.tno+" is bigger");
        }
    }
} 
class Q6
{
    public static void main(String[]args)
    {
        C c=new C();
        D d= new D();
        c.getTno();
        c.avg();
        d.big(c);
    }
}