class Logic
{
    boolean CheckPerfect(int num)
    {
        int iCnt = 0, iSum = 0;

        for(iCnt = 1; iCnt < num; iCnt++)
        {
            if((num % iCnt) == 0) 
            {
                iSum = iSum + iCnt;
            }
        }
       
        if(iSum == num)
        {
            return true;
        }
        else
        {
            return false;
        }

    }
}

class program3_20
{
    public static void main(String A[])
    {
        boolean bRet = false;
        Logic lobj = new Logic();
        bRet = lobj.CheckPerfect(6);


        if(bRet == true)
        {
            System.out.println("It is a perfect number");
        }
        else
        {
            System.out.println("It is not a perfect number");
        }
    }
}
