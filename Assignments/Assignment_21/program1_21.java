class Logic
{
    void ProductOfDigits(int num)
    {
        int iDigit = 0;
        int iProduct = 1;
         
        while(num != 0)
        {
            iDigit = num % 10;
            num = num / 10;

            iProduct = iProduct * iDigit;
        }
        System.out.println("Product od digits is : "+iProduct);
    }
}

class program1_21
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.ProductOfDigits(234);
    }
}