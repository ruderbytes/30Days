class OuterClass{
	int i = 10; // non static member of outer class
	static int j; // static member of outer class
	
	//Static method of outer class
	static void printer(){
		System.out.println("Static method of Outer");
	}
	
	void nonStsticPrinter(){
		System.out.println("Non static method of outer class");
	}
	
	//Static Inner class
	static class InnerClass{
		//Inner class have access to the static memeber of outer class
		int x = 100; //Static inner class can have static as well as non static members
		System.out.println(j); //Legal
		
		//System.out.println(i); //illegal
		
		printer(); //can call Ststic method of outer class
		
		//nonStaticPrinter(); Illegal
	}
}
  	
class Runner{
	
	public static void main(String[] args){
		
		//Static Member can be direclty accessed using 
		// class name.
		
		System.out.println(OuterClass.j);
	
		
	}
}
