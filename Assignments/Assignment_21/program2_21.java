class Logic
{
    void CountEvenOddRange(int num)
    {
        int iCnt = 0;
        int iCountEven = 0;
        int iCountOdd = 0;

        for(iCnt = 1; iCnt <= num; iCnt++)
        {
            if((iCnt % 2) == 0)
            {
                iCountEven++;
            }
            else
            {
                iCountOdd++;
            }
        }
        System.out.println("Count of even numbers are : "+iCountEven);
        System.out.println("Count of odd numbers are : "+iCountOdd);
    }
}

class program2_21
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.CountEvenOddRange(7);
    }
}