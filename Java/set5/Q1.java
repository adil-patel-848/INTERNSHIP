class Q1
{
    int data[];
    Q1(int [] a)
    {
    data=a;
    }
    public static void main(String[]args)
    {
        int a[]= {34,45,26,73,19,90};
        Q1 obj = new Q1(a);
        obj.getBS(obj);
    }
    void getBS(Q1 obj)
    {
        int b=obj.data[0];
        int s=obj.data[0];
        for(int i=0;i<obj.data.length;i++)
        {
            if(obj.data[i]>b)
            {
                b=obj.data[i];
            }
            if(obj.data[i]<s)
            {
                s=obj.data[i];
            }
        }
        System.out.println("Big="+b);
        System.out.println("Small="+s);

    }
}