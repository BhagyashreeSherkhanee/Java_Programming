class Logic
{
    void CheckEvenOdd(int Num)
    {
        if((Num % 2) == 0)
        {
            System.out.println("It is even number");
        }
        else
        {
            System.out.println("It is Odd number");
        }
    }
}
class program2_16
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.CheckEvenOdd(7);
    }
}