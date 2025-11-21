class Logic
{
    void CheckLeapYear(int year)
    {
        if((((year % 4) == 0) && ((year % 400) == 0)) || ((year % 100) != 0))
        {
            System.out.println("It is Leap year");
        }
        else
        {
            System.out.println("It is not a leap year");
        }
    }
}


class program1_19
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.CheckLeapYear(2024);
    }
}