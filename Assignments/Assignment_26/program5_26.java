import java.util.*;

class Pattern
{
    public void Display(int num)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= num; iCnt++)
        {
            System.out.print(iCnt * 2+"\t");    
        } 
    }
}

class program5_26
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;
        System.out.println("Enter the frequency : ");
        iValue = sobj.nextInt();

        Pattern pobj = new Pattern();
        pobj.Display(iValue);
    }
}