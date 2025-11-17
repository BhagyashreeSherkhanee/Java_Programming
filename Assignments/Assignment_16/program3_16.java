class Logic
{
    void FindFactorial(int Num)
    {
        int iCnt = 0, iFact = 1;

        for(iCnt = 1; iCnt <= 5; iCnt++)
        {
            iFact = iFact * iCnt;
        }
        System.out.println("Factorial of 5 is"+iFact);
    }
}


class program3_16
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.FindFactorial(5);
    }
}