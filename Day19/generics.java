//This Generic Class Only Allow Numbers
class genTwoParam<T extends Number,V extends Number>{
	T tObj;
	V vObj;
	//Constructor
	genTwoParam(T t ,V v){
		tObj=t;
		vObj=v;
	}
	T getT(){
		return tObj;
	}	
	V getV(){
		return vObj;
	}
}

class genericsDemo{
	public static void main(String[] args){
		genTwoParam<Integer,Integer> genObj= new genTwoParam<Integer, Integer>
							(99,11);
//Not Allowed Due to Bounded Generic Type		
//		genTwoParam<Integer,Integer> genObj= new genTwoParam<Integer, Integer>
//							("Abc",11);

		int x = genObj.getT();
		System.out.println(x);
		int y = genObj.getV();
		System.out.println(y);

	}
}

	

