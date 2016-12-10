import java.util.*;

/*
	Linked Hash Set - Always Maintain order
	Doesnt Allow Duplicates
	
*/

class demoLinkedHashSet{
	public static void main(String[] args){
		LinkedHashSet<String> lhash = new LinkedHashSet<String>();
		lhash.add("A");
		lhash.add("B");
		lhash.add("C");
		lhash.add("D");
		lhash.add("A");
		//Iterator
		System.out.println("Printing Through Iterator");

		Iterator<String> itr = lhash.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}	
	
		System.out.println("Printing Through Enhanced For Loop");
		for(String x:lhash){
			System.out.println(x);
		}
	}
} 
