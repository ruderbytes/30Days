class A{}

class ExceptionHandling
{
    public static void main(String[] args)
    {
        System.out.println("This statement will be executed"); 
 		Object o = new Object();
        try
        {
        	A a = (A)o;
        }
        catch (ClassCastException e)
        {
            System.out.println("Exception Caught");
        }
 
        System.out.println("Now, This statement will also be executed");
    }
}
