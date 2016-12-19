class TestClass{
	public static void main(String args[ ] ){
		int i = 1;
		int[] iArr = {1};
		/*
			It is simple variable passing and no value is returned so the value
			will not change in this current scope.
		*/
		incr(i) ;
		/*
			Array elements get affected when passed into methods.
		*/
		incr(iArr) ;
		System.out.println( "i = " + i + " iArr[0] = " + iArr [ 0 ] ) ;
	}
	public static void incr(int n ) { n++ ; }
	public static void incr(int[ ] n ) { n [ 0 ]++ ; }
}
