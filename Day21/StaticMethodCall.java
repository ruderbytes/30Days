class A
{
    static void staticMethod()
    {
        System.out.println("Static Method");
    }
}
//You can call static methods through reference variable which is pointing to null. Output will be,
//Static Method
class MainClass
{
    public static void main(String[] args)
    {
        A a = null;
 
        a.staticMethod();
    }
}
