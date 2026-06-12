// 6. Write a program to find biggest of three numbers without using logical operators by taking input from the user. 

class Q6
{
    public static void main(String[]args)
    {
        int a=6, b=3, c=0;
        if(a>b)
        {
            if(a>c)
                System.out.println(a+" is bigger");
            else
                System.out.println(c+" is bigger");
        }
        else if(b>a)
        {
            if(b>c)
                System.out.println(b+" is bigger");
            else
                System.out.println(c+ " is bigger");
        }
    }
}