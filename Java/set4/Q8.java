// 8) Write a program to find the average of 3 numbers using parameterized constructor. 

class Q8
{
    Q8(int a, int b, int c)
    {
        float avg=(float)(a+b+c)/3;
        System.out.println("Average: "+avg);
    }
    public static void main(String[]args)
    {
        new Q8(34,45,87);
    }
}