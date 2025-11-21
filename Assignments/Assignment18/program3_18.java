class Logic
{
    void PrintOddNumber(int n)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= n; iCnt++)
        {
            if((iCnt % 2) != 0)
            {
                System.out.println(iCnt);
            }
        }
    }
}

class program3_18
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.PrintOddNumber(20);
    }
}