class A{
	void show(){
		System.out.println("In class A");
	}
}

class B extends A{
	void show(){
		System.out.println("In class B");
	}
}

class main{
	public static void main(String [] args){
		A ob1 = new A(); //Reference of Class A , A object
		A ob2 = new B(); //Reference of Class B , B object
			
		ob1.show(); //Runs A version of Show
		ob2.show(); // Runs B version of show
	}
}
