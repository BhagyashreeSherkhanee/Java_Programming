class Logic
{
    void calculatePower(int base, int exp)
    {
        int iCnt = 0, ipower = 1;

        for(iCnt = 1; iCnt <= exp; iCnt++)
        {
            ipower = ipower * base;
        }
        System.out.println(ipower);
    }

}

class program5_19
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.calculatePower(2,5);
    }
}