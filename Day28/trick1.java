//Constructor tricks

class superClass{
	static String s1 = "";
	protected superClass(){
		s1 += "super";
		System.out.println("Super");
	}
}

class subClass extends superClass{
	subClass(){
		s1 += "Sub";
		System.out.println("Sub");
	}
}
class subSubClass extends subClass{
	private subSubClass(){
		s1 += "sub-sub";
		System.out.println("Sub Sub");
	}
	public static void main(String[] args){
		new subSubClass();
		System.out.println(s1);
	}
}
