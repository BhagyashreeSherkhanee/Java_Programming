import java.util.*;

class ArrayX
{
    public void Display(int Brr[])
    {
        int i = 0;
        System.out.println("ELements of array are : ");
        for(i = 1; i < Brr.length; i++)
        {
            System.out.println(Brr[i]);
        }
    }

    public int CountEven(int Brr[])
    {
        int i = 0;
        int iCount = 0;

        for(i = 0; i < Brr.length; i++)
        {
            iCount++;
        }
        return iCount;
    }

    public int Summation(int Brr[])
    {
        int i = 0;
        int iSum = 0;

        for(i = 0; i < Brr.length; i++)
        {
            iSum = iSum + Brr[i];
        }
        return iSum;
    }
}
class program102
{
    public static void main(String A[])
    {
        int i = 0; int iSize = 0; int iRet = 0;

        Scanner sobj = new Scanner (System.in);
        
        System.out.println("enter the size of array : ");
        iSize = sobj.nextInt();

        int Arr[] = new int[iSize];

        System.out.println("Enter the elements : ");

        for(i = 1; i < Arr.length; i++)
        {
            Arr[i] = sobj.nextInt();
        }

        ArrayX aobj = new ArrayX();
        aobj.Display(Arr);

        iRet = aobj.Summation(Arr); 
        System.out.println("Summation is : "+iRet);

        aobj = null;
        Arr = null;
        sobj = null;

        System.gc();
    }
}