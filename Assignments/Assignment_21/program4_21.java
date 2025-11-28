class Logic
{
    void CountFactors(int num)
    {
        int iCnt = 0;
        int iCount = 0;

        for(iCnt = 1; iCnt <= (num/2); iCnt++)
        {
            if((num % iCnt) == 0)
            {
                iCount++;
            }
        } 
        System.out.println("Total number of factors are : "+iCount);
    }
}

class program4_21
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.CountFactors(20);
    }
}


//error