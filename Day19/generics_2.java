class genDemo<T extends Number>{
	T num[];
	
	genDemo(T[] x){
		num = x;
	}

	//Return Double in all cases
	double avg(){
		double sum = 0.0;
		for(int i=0;i<num.length;i++)
			sum+=num[i].doubleValue();
		return sum/num.length;
	}
	//Now suppose we wnant to compare average of Integer and Double
	//we use wild card that means it accept both integer and Double type
	// to be more precise - only matches valid genDemo objects
	boolean sameAvg(genDemo <?> ob){
		if(this.avg() == ob.avg())
			return true;
		
		else 
			return false;
	}
}

class driver{
	public static void main(String[] args){
		//Integer type object
		Integer x[] = {1,2,3,4};
		genDemo<Integer> obj_int = new genDemo<Integer>(x);
		double i_result = obj_int.avg();
		System.out.println(i_result);
		//Double Type Onject
		Double y[] = {1.5,2.5,3.5,4.5};
		genDemo<Double> obj_double = new genDemo<Double>(y);
		double d_result = obj_double.avg();
		System.out.println(d_result);
		//Comparing the AVG
		if(obj_int.sameAvg(obj_double))
			System.out.println("True");
		else
 			System.out.println("Flase");




		//Double Type Onject
		Double z[] = {1.0,2.0,3.0,4.0};
		genDemo<Double> obj_double_2 = new genDemo<Double>(z);
		double d_result_1 = obj_double_2.avg();
		System.out.println(d_result_1);
		//Comparing the AVG
		if(obj_int.sameAvg(obj_double_2))
			System.out.println("True");
		else
 			System.out.println("Flase");



	}
}

	
