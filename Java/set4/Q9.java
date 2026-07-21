// 9) Write a program to find the remainder of two integers using the copy constructors. 

class Q9
{
    public static void main(String[]args)
    {
        Rem r1 =new Rem(6,1222);
        r1.dsplay();


    }
}
class Rem
{
    int a,b;
    double rem;
    Rem(int a, int b) 
    {
        this.a=a;
        this.b=b;
    }
    Rem(Rem c)
    {
       a=c.a;
       b=c.b;
    }
    void dsplay()
    {
        System.out.println("Remainder: "+(a%b));
    }
}