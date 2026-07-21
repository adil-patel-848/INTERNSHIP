/* 6) Write  a program to find the distance between the two points in 
Cartesian co-ordinate system using objects as arguments and return it to the main class.*/

class Q6
{
    public static void main(String[]args)
    {
        Distance c1=new Distance();
        Distance c2=new Distance();
        c1.getData(3,6);
        c2.getData(7,2);
        Distance d= new Distance();
        System.out.println("Distance: "+d.getDist(c1,c2));       
    }
}
class Distance
{
    int x,y;
    void getData(int a, int b)
    {
        x=a;
        y=b;
    }
    float getDist(Distance c1, Distance c2)
    {
        double op=((Math.pow(c1.x-c2.x,2))+(Math.pow(c1.y-c2.y,2)));
        float dist=(float)Math.sqrt(op);
        return dist;
    }
}
