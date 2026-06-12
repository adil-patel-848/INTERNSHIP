// 5. Write a program to find biggest of three numbers by using logical operator by taking input from the user. 

class Q5
{
    public static void main(String[]args)
    {
        int a=6, b=3, c=0;
        if(a>b && a>c)
            System.out.println(a+" is bigger");
        else if(b>a && b>c)
                System.out.println(b+" is bigger");
            else
                System.out.println(c+ " is bigger");
        }
}