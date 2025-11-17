class Logic
{
    void ReverseNumber(int iNo)  
    {
        int iCnt = 0, iDigit = 0, iRev = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10; 
            iNo = iNo / 10;

            iRev = ((iRev * 10) + iDigit);
        }
        System.out.print("Reverse number are : "+iRev);
    }
}

class program4_16
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.ReverseNumber(1234);
    }
}