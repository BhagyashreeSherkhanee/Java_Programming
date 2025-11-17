class Logic
{
    void CountDigits(int iNo)
    {
        int iDigit = 0, iCount = 0;
        
        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iCount++;
            iNo = iNo / 10;  
        }
        System.out.println("Count of digits is : "+iCount);
    }
}

class program5_16
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.CountDigits(7865);
    }
}