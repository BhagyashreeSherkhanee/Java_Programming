class Logic
{
    void FindLargestDigit(int num)
    {
        int iDigit = 0;
        int iMax = 0;

        while(num != 0)
        {
            iDigit = num % 10;
            num = num / 10;

            if(iDigit > iMax)
            {
                iMax = iDigit;
            }
        }
        System.out.println("Maximum number is : "+iMax);
    }
}


class program4_20
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.FindLargestDigit(83429);
    }
}