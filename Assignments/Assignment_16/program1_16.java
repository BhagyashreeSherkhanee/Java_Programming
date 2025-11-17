class Logic
{
    void calculateSum(int n)
    {
        int iCnt = 0, iSum = 0;

        for(iCnt = 0; iCnt <= n; iCnt++)
        {
            iSum = iSum + iCnt; 
        }

        System.out.println("Summation of N Natural number is :"+iSum);
    }
}

class program1_16
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.calculateSum(10);
    }
}