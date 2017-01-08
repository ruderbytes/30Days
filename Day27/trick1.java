class X{
	private final void printer(){
		System.out.println("Private method of X (Hidded for subclass of X)");
	}
}
class Y extends X{
	private final void printer(){
		System.out.println("No overriding occur as superclass method is hidden due to private");
	}
	public static void main(String[] args){
		new Y().printer(); 
	}
}
