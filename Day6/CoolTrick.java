class mysuper{
	mysuper(int i){
		
	}
}
abstract class mysub extends mysuper{
	mysub(int x){
		super(x);
	}
	public abstract void m1();
}

class javaTrick
{
	public static void main (String[] args) throws java.lang.Exception
	{
		/*Anon inner Class || Not going to compile due to constructors as anon class
		is actaully a subclass of mysub, which do not provide a parametrized constructor
		*/
		mysub s1 = new mysub(){
			public void m1(){
				System.out.println("Not Going to Compiled");
			}	
		};
		/*
		This will Compile
		mysub s1 = new mysub(7){
			public void m1(){
				System.out.println("Not Going to Compiled");
			}	
		};
		*/
	}
}
