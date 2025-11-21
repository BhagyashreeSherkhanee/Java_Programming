class Logic
{
    boolean CheckPrime(int iNum)
    {
       int iCnt = 0;
       
       for(iCnt = 2; iCnt <= iNum/2; iCnt++)
       {
            if((iNum % iCnt) == 0)
            {
                return false;
            }
       }
       return true;
    }
}

class program1_18
{
    public static void main(String A[])
    {
        boolean bRet = false;
        Logic lobj = new Logic();
        bRet = lobj.CheckPrime(11);

        if(bRet == true)
        {
            System.out.println("It is prime number");
        }
        else
        {
            System.out.println("It is not a prime number");
        }
        
    }
}


