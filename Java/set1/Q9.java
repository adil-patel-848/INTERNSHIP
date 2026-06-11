// 9. Write a program to illustrate the use of bitwise and ,or and XOR operators. 

class Q9
{
    public static void main(String[]args)
    {
        int a=4;
        int b=7;
        System.out.println("A: "+a+" B: "+b); // 4 7
        System.out.println("Bitwise AND: "+ (a&b)); // 4
        System.out.println("Bitwise OR: "+ (a|b)); // 7
        System.out.println("Bitwise XOR: "+ (a^b)); // 3
    }
}