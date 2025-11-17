class Logic
{
    void CheckPalindrome(int iNo)
    {
        int iDigit = 0, iRev = 0, iCopy = iNo;

        while(iNo != 0)
        {
            iDigit = iNo % 10;  //1 2  1
            iNo = iNo / 10;     //12  1   0

            iRev = ((iRev * 10) + iDigit);  //1  12   121
        }
        if(iCopy == iRev)
        {
            System.out.println("Given number is palindrome");
        }
    }
}

class program2_17
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.CheckPalindrome(121);
    }
}