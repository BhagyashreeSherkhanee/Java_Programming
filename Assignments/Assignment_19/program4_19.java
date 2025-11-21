class Logic
{
    void printDigits(int num)
    {
        int iDigit = 0;

        while(num != 0)
        {
            iDigit = num % 10;
            num = num / 10;

            System.out.println(iDigit);
        }
        
    }
}

class program4_19
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.printDigits(9876);
    }
}