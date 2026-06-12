// 8. Write a program to check whether a given number is even or odd using switch.

class Q8
{
    public static void main(String[]args)
    {
        int num=78;
        switch(num%2)
        {
            case 0:
                System.out.println("Number is even");
                break;
            case 1:
                System.out.println("Number is odd");
                break;
        }
    }
}