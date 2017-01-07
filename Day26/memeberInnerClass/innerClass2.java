//Non static Inner Class
// Member Inner class


// MIC Must only contain Non-static members.


class outer{
	static int avg;
	int x = 10;
	
	void show_beta(){
		//create a instance of inner clas
		memberInnerClass inner = new memberInnerClass();
		System.out.println(inner.beta);
	}

	class memberInnerClass{
		// Compile time error	
	//	static int a;
	//	static void alpha(){}	
		int beta = 64;
		int x = 70;
		// Can access outer class variables	
		void alpha(){
			outer o = new outer();
			System.out.println("Parameter of Outer class"+o.x);
			System.out.println("Inside Inner class x"+x);
		}




	}
}

class runner{
	public static void main(String[] args){
		
		//Instantiate outer class obj 
		outer outObj = new outer();
		//Instantiate Inner class obj 
		outer.memberInnerClass in = outObj.new memberInnerClass();
		outObj.show_beta();		
		in.alpha();
	}
}














