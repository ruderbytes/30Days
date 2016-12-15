class A{
	void play(){
		System.out.println("In class A");
	}
}

class B extends A{
	void play(){
		System.out.println("In class B");
	}
	void play(String s){
		System.out.println("In Overloaded Function of Class B " +s);
	}
}

class runner{
	public static void main(String[] args){
		
		// Reference of A and object of A
		A obj1 = new A();
		obj1.play();

		// Refernce of A but object of B
		A obj2 = new B();
		obj2.play();
		
		//Reference of A object of B
		// There is no Method play(String s) in class A
		//A obj3 = new B();
		//obj3.play("Not going to Compile !");

		B obj4 = new B();
		obj4.play("Overloading of method Play");

	}
}


