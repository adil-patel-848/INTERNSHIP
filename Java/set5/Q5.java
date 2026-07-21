/* 5) Write a program to find circumference and area of circle using two different classes called
Circumference & Area by inheriting a Class called PI .Inherit the value of PI as public data member
and set the value to PI using public member function. */

import java.util.Scanner;

class PI
{
    public static float pi; 
    public static void setPI(double x)
    {
        pi=(float)x;
    }
}
class Circumference extends PI
{
    float c;
    void circumference(float r)
    {
        c=2*pi*r;
        System.out.println(pi);
        System.out.println("Circumference of circle with radius "+r+" is: "+c);
    }
}
class Area extends PI
{
    float a;
    void area(float r)
    {
        a=pi*r*r;
        System.out.println("Area of circle with radius "+r+" is: "+a);
    }
}
class Q5
{
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        Area s= new Area();
        Circumference d = new Circumference();
        System.out.print("Enter radius: ");
        float radius=sc.nextFloat();
        PI.setPI(3.14);
        s.area(radius);
        d.circumference(radius);
    }
}