class A{
	A(){
		System.out.println("Object A Created");
	}
	
	A doStuff(){
		return new A();
	}
}

class B extends A{
	B(){
		//NOTE implicit super() call
		System.out.println("Object B Created");
	}
	
	//Legal Override (Look at return Type !)
	B doStuff(){	
		return new B();
	}
	void runMe(){
		System.out.println("Run Me method");
	}
}


class runner{
	public static void main(String[] args){
		
		B obj = new B();
		B x = obj.doStuff();
		x.runMe();
	}
}


