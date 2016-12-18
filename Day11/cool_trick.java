class A{
	int i = 10;
	int m1(){
		return i;
	}
}
class B extends A{
	int i =20;
	int m1(){
		return i;
	}
}
class C extends B{
	int i =30;
	int m1(){
		return i;	
	}
}

class test{
	public static  void main(String[] arg){
		A x = new C();
		B y = (B)x;

		System.out.println(x.m1());
		System.out.println(x.i);
		System.out.println(y.i);
	}
}
		


















