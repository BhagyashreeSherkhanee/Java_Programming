class Logic
{
    void SumEvenOddDigits(int num)
    {
        int iDigit = 0, iOddSum = 0, iEvenSum = 0;

        while(num != 0)
        {
            iDigit = num % 10;
            num = num / 10;

            if((iDigit % 2) == 0)
            {
                iEvenSum = iEvenSum + iDigit;
            }
            else
            {
                iOddSum = iOddSum + iDigit;
            }
        }
        System.out.println(iEvenSum);
        System.out.println(iOddSum);
    }
}


class program4_18
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.SumEvenOddDigits(123456);
    }
}