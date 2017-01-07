//Non static Inner Class
// Member Inner class


// MIC Must only contain Non-static members.


class outer{
	static int avg;
	int x = 10;

	class memberInnerClass{
		// Compile time error	
	//	static int a;
	//	static void alpha(){}	
	
		void alpha(){
			System.out.println(x);
		}



	}
}

class runner{
	public static void main(String[] args){
		
		//Instantiate outer class obj 
		outer outObj = new outer();
		//Instantiate Inner class obj 
		outer.memberInnerClass in = outObj.new memberInnerClass();
		
		in.alpha();
	}
}














