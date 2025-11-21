import java.util.*;

class Pattern 
{
    public void Display(int iRow, int iCol)
    {
        int i = 0;
        int j = 0;
        char ch1 = '\0';
        char ch2 =  '\0';

        for(i = 1; i <= iRow; i++)
        {
            for(j = 1,ch1 = 'a',ch2 = 'A'; j <= iCol; j++,ch1++,ch2++)
            {
                if((i % 2) == 0)
                {
                    System.out.print(ch1+"\t");
                }
                else
                {
                    System.out.print(ch2+"\t");
                }
                
            }
            System.out.println("\n");
        }
    }
}
class program2_28
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue1 = 0;
        int iValue2 = 0;

        System.out.println("Enter the number of rows : ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter the number of columns : ");
        iValue2 = sobj.nextInt();

        Pattern pobj = new Pattern();
        pobj.Display(iValue1, iValue2);

    }
}