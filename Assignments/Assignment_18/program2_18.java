class Logic
{
    void PrintEvenNumber(int n)
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

class program2_18
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.PrintEvenNumber(20);
    }
}