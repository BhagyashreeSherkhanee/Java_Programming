class Logic
{
    void FindMax(int a, int b)
    {
        if(a > b)
        {
            System.out.println(a+" is Maximum number");
        }
        else
        {
            System.out.println(b+" is maximum number");
        }
    }
}

class program3_17
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.FindMax(20,15);
    }
}