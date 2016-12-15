class A{
	void show(){
		System.out.println("In class A");
	}
}

class B extends A{
	void show(){
		System.out.println("In class B");
	}
	void  someOtherMethod(){
		System.out.println("This cant be invoked with Reference of class A");
	}
}

class main{
	public static void main(String [] args){
		A ob1 = new A(); //Reference of Class A , A object
		A ob2 = new B(); //Reference of Class B , B object
			
		ob1.show(); //Runs A version of Show
		ob2.show(); // Runs B version of show
		//This will not Compile, 
		// Cant invoke method of class B with refernce of A
		// Only overrridden methods can be invoked with refernce of A on
		// Class B object.
		//ob2.someOtherMethod();
		
		
	}
}
