class Logic
{
    void DisplayGrade(int Marks)
    {
        if((Marks >= 80) && (Marks < 100))
        {
            System.out.println("Grade A+");
        }
        else if((Marks >= 50) && (Marks < 80))
        {
            System.out.println("Grade B");
        }
        else if(Marks < 45)
        {
            System.out.println("Grade C");
        }

    }
}

class program2_19
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.DisplayGrade(82);
    }
}