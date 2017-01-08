//Finding order of printing/execution
//
// First priority of execution - init block -> constructor (in single class)
// In case of inheritance [super() from subclass -> init block -> constructor of class]				 
//
class Fruits{
	{System.out.println("Fruit Class");}
	Fruits(){
		System.out.println("Fruits Const");
	}
}

class Apple extends Fruits{
	static{System.out.println("Apple 1");}
	Apple(){
		System.out.println("Apple");
	}
	
	{System.out.println("Apple Class");}
	static{System.out.println("Apple 2");}
}
class runner{
	public static void main(String[] agrs){
		System.out.println("Start");
		new Apple();
		System.out.println("End");
	}
}



