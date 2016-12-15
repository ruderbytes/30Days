class A{
	void play(){
		System.out.println("Play in Class A");
	}
}

class B extends A{
	void play(){
		System.out.println("Play in class B");
	}
	
	void show(){
		System.out.println("Show in Class B");
	}
}

class runner{
	public static void main(String[] args){
		//Array of objects
		A [] arr = { new A(), new B(), new A() };
		
		for(A itr : arr){

			itr.play();
			// if itr is instance of B 
			// Execute Show() method
			if(itr instanceof B){
				//This will not compile without casting
				//itr.show();

				B objOfB = (B) itr;
				objOfB.show();
			}
		}
	}
}	
		





