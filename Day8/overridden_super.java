class A{
	void show(){
		System.out.println("In class A--Method will be called from Subclass");
	}
}

class B extends A{
	void show(){
		super.show();
		System.out.println("In class B");
	}
}

class main{
	public static void main(String [] args){
		// How to invoke Superclass overridden method form Subclass Method ??
		B ob = new B();
		ob.show();

	}
}
