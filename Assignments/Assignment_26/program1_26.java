import java.util.*;

class Pattern
{
    public void Display(int num)
    {
        int iCnt = 0;
        char ch = 'A';

        for(iCnt = 1; iCnt <= num; iCnt++,ch++)
        {
            System.out.print(ch+"\t");
        }
    }

}

class program26_1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;
        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        Pattern pobj = new Pattern();
        pobj.Display(iValue);
    }
}