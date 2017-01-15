class runner{
	public static void main(String[] grs){
		//Wrapper class doesnt have no-args consrtuctor
		// Integer x = new Integer(); --> illegal
		Integer x = new Integer("3");
		Integer y = new Integer(5);
		System.out.println(x);
		System.out.println(y);
	}
}
