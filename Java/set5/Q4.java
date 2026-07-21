/* Write a program to create 5 classes which contains one data member and one member function to get the data. 
Inherit all classes in multilevel manner into a 5th class and create an array for these data member's in 
function of 5th class to find the sum of the all the data members */

import java.util.Scanner;

class A{
    Scanner sc = new Scanner(System.in);
    int a;
    void fn()
    {
        System.out.print("Enter first number: ");
        a=sc.nextInt();
    }
}
class B extends A 
{
    int b;
    void sn()
    {
        super.fn();
        System.out.print("Enter second number: ");
        b=sc.nextInt();
    }
}
class C extends B 
{
    int c;
    void tn()
    {
        super.sn();
        System.out.print("Enter third number: ");
        c=sc.nextInt();
    }
}
class D extends C
{
    int d;
    void fon()
    {
        super.tn();
        System.out.print("Enter fourth number: ");
        d=sc.nextInt();
    }
}
class E extends D 
{
    int e[];
    int sum=0;
    void add()
    {
        super.fon();
        e=new int[]{a,b,c,d};
        for(int i=0; i<e.length; i++)
        {
            sum+=e[i];
            System.out.print(e[i]+" ");
        }
    }
}
class Q4
{
    public static void main(String[]args)
    {
    E obj=new E();
    obj.add();
    }
}