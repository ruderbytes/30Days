class TwoD{
	int x ,y;
	TwoD(int a, int b){
		x = a;
		y = b;
	}
}
class ThreeD extends TwoD{
	int z;
	ThreeD(int a, int b, int c){
		super(a,b);
		z = c;
	}
}
class FourD extends ThreeD{
	int w;
	FourD(int a, int b, int c, int d){
		super(a,b,c);
		w = d;
	}
}
//Bounded Generic class with Bounded wildcard
class genDemo<T extends TwoD>{
	T [] xyz;

	genDemo(T[] ob){
		xyz = ob;
	}

	void show(


	
