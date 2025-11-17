class Logic
{
    void FindMin(int a, int b, int c)
    {
        if((a < b) && (a < c))
        {
            System.out.println(a+" is smaller than "+b+" and "+c);
        }
        else if((b < a) && (b < c))
        {
            System.out.println(b+" is smaller than "+a+" and "+c);
        }
        else
        {
            System.out.println(c+" is smaller than "+a+" and "+b);
        }
    }
}

class program4_17
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.FindMin(3,7,2);
    }
}