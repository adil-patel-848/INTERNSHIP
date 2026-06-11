// 4. Write a program to illustrate the use of shortcut of assignment operator  for all arithmetic operations. 

class Q4
{
    public static void main(String[]args)
    {

        int a=6;

        System.out.println("Addition: "+(a+=5)); // 6+5=11
        System.out.println("Subtraction: "+(a-=2)); // 11-2=9
        System.out.println("Multiplication: "+(a*=2)); // 9*2=18
        System.out.println("Division: "+(a/=6)); // 18/6=3
        System.out.println("Modulus: "+(a%=2)); // 3%2=1

        System.out.println("A: "+a);
    }
}