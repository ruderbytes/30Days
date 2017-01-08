class X{
	X(){
		System.out.println("X Class const.");
	}
	X(String s){
		this();
		System.out.println("X Class const."+s);
	}
}
class Y extends X{
	Y(){
		System.out.println("Y Class const.");
	}
	Y(String x){
		this();
		System.out.println("Y Class const."+x);
	}
	public static void main(String[] agrs){
		new Y("Hello");
	}
}






















