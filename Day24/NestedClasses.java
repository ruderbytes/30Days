/* There are Two type of Nested classes-
1. Static Nested Classes
2. Non-Static Nested Classes or Inner Classes
*/
// Static Nested Classes can have both non static and Static class members
class OuterClass
{
    static class NestedClass
    {
        static int i;    //Static Field
        int j;      //Non-static Field
        void methodOne()
        {
            //Non-static method
        }
        static void methodTwo()
        {
            //Static Method
        }
    }
}
