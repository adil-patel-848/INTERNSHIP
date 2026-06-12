// 2. Write a program to find the position of a point in Cartesian coordinate system using ternary operator. 

class Q2
{
    public static void main(String[]args)
    {
        int x=5, y=0;
        String pos= (x>0 && y>0)?"point lies in 1st quadrant":(x<0 && y>0)?"point lies in 2nd quadrant":
                    (x<0 && y<0)?"point lies in 3rd quadrant":(x>0 && y<0)?"point lies in 4th quadrant":
                    (x>0 && y==0)?"point lies on positive x axis":(x==0 && y>0)?"point lies on positive y axis":
                    (x==0 && y<0)?"point lies on negative x axis":(x<0 && y==0)?"point lies on negative y axis":"point lies on origin";
        System.out.println(pos);
    }
}