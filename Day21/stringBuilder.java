// This will not Compile
class TestClass{
	public static void main(String args[ ] ){
		String s = "hello";
		StringBuilder sb = new StringBuilder( "hello" );
		sb.reverse();
		// There is no Reverse method. 
		s.reverse();
		if( s == sb.toString() ) System.out.println( "Equal" );
		else System.out.println( "Not Equal" );
	}
}
