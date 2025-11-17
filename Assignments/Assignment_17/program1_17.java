class Logic
{
    void SumOfDigits(int no)
    {
        int iDigit = 0, iSum = 0;

        while(no != 0)
        {
            iDigit = no % 10;
            no = no /10;

            iSum = iSum + iDigit;
        }
        System.out.println("Sum of digits is :"+iSum);
    }

}

class program1_17
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.SumOfDigits(1234);
    }
}