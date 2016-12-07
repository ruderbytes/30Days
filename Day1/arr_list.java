import java.util.*;

class ArrayListDemo{
	public static void main(String [] args){
		//Since Java 1.5 all Java Collection farmework is generic.
		ArrayList<String> ar1 = new ArrayList<String>();
		ar1.add("First");
		ar1.add("Second");
		ar1.add("Third");
		ar1.add("Fourth");
		ar1.add("Fifth");

		//Get iterator to Traverse
		Iterator itr = ar1.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}

		System.out.println("-----------");

		// Using Enchanced For loop
		for(String ob:ar1){
			System.out.println(ob);
		}
		
	}
}		





