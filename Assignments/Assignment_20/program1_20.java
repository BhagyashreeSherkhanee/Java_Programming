class Logic
{
    void SumEvenNumbers(int n)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= n; iCnt++)
        {
            if((iCnt % 2) == 0)
            {
                System.out.println(iCnt);
            }
        }
    }
}

class program1_20
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.SumEvenNumbers(10);
    }
}