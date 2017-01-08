//Proper class type casting
class x{
	void runme(){}
}
class y extends x{
	void runmeagain(){
	System.out.println("MEthod of Y");}
}

class runner{
	public static void main(String[] agrs){
		x obj = new y();
		//Now call method of class y
		// use type casting
		//Illegal ways to cast (needed two set of brackets)
		// (y).obj.runmeagain();
		((y)obj).runmeagain();	

	}
}




























