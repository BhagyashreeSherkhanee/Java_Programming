class Logic
{
    void CheckSign(int num)
    {
        if(num > 0)
        {
            System.out.println("It is positive number");
        }
        else if(num < 0)
        {
            System.out.println("It is negative number");
        }
        else
        {
            System.out.println("It is zero");
        }
    }
}

class program5_18
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.CheckSign(-8);
    }
}