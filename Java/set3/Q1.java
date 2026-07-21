// 1) Write a program to perform the different arithmetic operations based on the user choice in numerical form using switch. 

import java.util.Scanner;
class Q1
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Modulus\n6.Exit\n\nEnter your choice:");
        int choice=sc.nextInt();
        switch(choice)
        {
            case 1:
                System.out.println("Enter operands:");
                int a1=sc.nextInt();
                int b1=sc.nextInt();
                System.out.println("Addition: "+(a1+b1));
                break;
            case 2:
                System.out.println("Enter operands:");
                int a2=sc.nextInt();
                int b2=sc.nextInt();
                System.out.println("Subtraction: "+(a2-b2));
                break;
            case 3:
                System.out.println("Enter operands:");
                int a3=sc.nextInt();
                int b3=sc.nextInt();
                System.out.println("Multiplication: "+(a3*b3));
                break;
            case 4:
                System.out.println("Enter operands:");
                int a4=sc.nextInt();
                int b4=sc.nextInt();
                System.out.println("Division: "+(float)(a4/b4));
                break;
            case 5:
                System.out.println("Enter operands:");
                int a5=sc.nextInt();
                int b5=sc.nextInt();
                System.out.println("Modulus: "+(a5%b5));
                break;
            case 6:
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}