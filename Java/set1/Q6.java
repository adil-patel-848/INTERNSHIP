// 6. Write a program to illustrate the use of post and pre increment operator and Decrement Operator. 

class Q6
{
    public static void main(String[]args)
    {
        int a=8;
        System.out.println("A: "+ a); // 8
        System.out.println("Pre increment: "+(++a)); // 9
        System.out.println("Post increment: "+(a++)); // 9 but a=10 after printing
        System.out.println("Decrement: "+(a--)); // 10 but a=9 after printing
        System.out.println("A: "+a);
    }
}