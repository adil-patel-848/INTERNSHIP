// 10. Write a program to find the sum of digits of a given number. 

 class Q10
{
    public static void main(String[]args)
    {
        int num=7134;
        int rem=0,sum=0;
        while(num>0)
        {
            rem=num%10;
            sum+=rem;
            num/=10;
        }
        System.out.println("Sum of numbers: "+sum);
    }
}