class Logic
{
    void DisplayFactors(int num)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= (num/2); iCnt++)
        {
            if((num % iCnt) == 0)
            {
                System.out.println("Factors are : "+iCnt);
            }
        } 
    }
}

class program3_21
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.DisplayFactors(12);
    }
}


//error