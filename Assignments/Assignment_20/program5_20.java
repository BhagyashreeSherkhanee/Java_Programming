class Logic
{
    void FindSmallDigit(int num)
    {
        int iDigit = 0;
        int iMin = num;

        while(num != 0)
        {
            iDigit = num % 10;
            num = num / 10;

            if(iDigit < iMin)
            {
                iMin = iDigit;
            }
        }
        System.out.println("Minimum number is : "+iMin);
    }
}

class program5_20
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.FindSmallDigit(83429);
    }
}