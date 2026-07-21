/* 3) Write a program to find the average of 3 Integers using a class, Where the class 
contains 4 data members and three methods like loadData(),findAverage() and getAvereage().*/

class Q3
{
    public static void main(String[]args)
    {
        Q3 av= new Q3();
        av.loadData(3,6,8);
        av.findAverage();
        System.out.println("Average: "+av.getAvereage());
    }
    int a,b,c;
    float avg;
    void loadData(int x,int y,int z)
    {
        a=x;
        b=y;
        c=z;
    }
    void findAverage()
    {
        avg=(float)(a+b+c)/3;
    }
    float getAvereage()
    {
        return avg;
    }
}