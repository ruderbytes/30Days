class runner{
	static int x = 5;
	public static void main(String[] args){
		go();
	}
	static void go(){
		//Local X
		int x = 10;
		go1();
	}
	static void go1(){
		//X on heap
		x*=5;
		go3(x);
		System.out.println(x);
	}
	static void go3(int x){
		//Local
		x*=7;
	}
}








