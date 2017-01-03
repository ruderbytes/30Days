class ExceptionHandling
{
    public static void main(String[] args)
    {
        System.out.println("This statement will be executed"); 
 
        try
        {
            int i = 1000/0;    //This statement throws ArithmaticException : / by zero
        }
        catch (ArithmeticException e)
        {
            System.out.println("Exception Caught");
        }
 
        System.out.println("Now, This statement will also be executed");
    }
}
