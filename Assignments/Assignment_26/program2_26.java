import java.util.*;

class Pattern
{
    public void Display(int num)
    {
        int iCnt = 0;

        for(iCnt = num; iCnt >= 1; iCnt--)
        {
            System.out.print(iCnt+"\t#\t");
        }
    }
}


class program2_26
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;
        System.out.println("Enter the Frequency : ");
        iValue = sobj.nextInt();

        Pattern pobj = new Pattern();
        pobj.Display(iValue);
    }
}