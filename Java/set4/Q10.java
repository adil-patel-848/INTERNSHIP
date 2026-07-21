//10)  Write a program to find the sum of 2,3 and 4 numbers using constructor overloading.

class Q10
{
    Q10(int a,int b)
    {
        System.out.println("Addition of 2 numbers: "+(a+b));
    }
    Q10(int a,int b, int c)
    {
        System.out.println("Addition of 3 numbers: "+(a+b+c));
    }
    Q10(int a,int b, int c, int d)
    {
        System.out.println("Addition of 4 numbers: "+(a+b+c+d));
    }
    public static void main(String[]args)
    {
        Q10 two=new Q10(5,7);
        Q10 three=new Q10(5,7,9);
        Q10 four=new Q10(5,3,7,9);
    }
}