class A
{
	A(){
		System.out.println("lol");
	}
    {
        System.out.println(1);
    }
}
 
class B extends A
{
	B(){
		System.out.println("lolol");
	}
    {
        System.out.println(2);
    }
}
 
class C extends B
{
	C(){
		System.out.println("lololol");
	}
    {
        System.out.println(3);
    }
}
 
class MainClass
{
    public static void main(String[] args)
    {
        C c = new C();
    }
}
