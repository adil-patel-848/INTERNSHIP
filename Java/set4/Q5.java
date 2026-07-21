/* 5) Write a program to print sum of two complex numbers by using object as 
argument (by returning object, Pass two objects as arguments). */

class Q5
{
    public static void main(String[]args)
    {
        Q5 num1= new Q5();
        Q5 num2= new Q5();
        num1.getData(5,9);
        num2.getData(3,7);
        Q5 add=new Q5().getSum(num1,num2);
        System.out.println("Equ: "+add.real+" + "+add.img+"i");
    }
    int real,img;
    void getData(int x, int y)
    {
        real=x;
        img=y;
    }
    Q5 getSum(Q5 cn1, Q5 cn2)
    {
        Q5 sum= new Q5();
        sum.real= cn1.real+cn2.real;
        sum.img= cn1.img+cn2.img;
        return sum;
    }
}