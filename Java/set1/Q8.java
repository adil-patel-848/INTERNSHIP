// 8. Write a program to illustrate the use of logical operators. 

class Q8
{
    public static void main(String[]args)
    {
        int a=6;
        int b=8;
        System.out.println("The numbers are single digit: "+ (a>0 && b<10)); // true
        System.out.println("B  is smaller: "+(a>b || b<a)); // false
        System.out.println("Not a=6 : "+!(a==6)); // false
    }
}