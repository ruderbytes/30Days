import java.util.*;

public class Main{
   public static void main(String[] argv){
     /* Doesnt maintain any order 
     	doesnt allow duplicate if add duplicate previous value overwritten
     	allows Null values
     	Not synchronized
     */
     HashSet<String> hash  = new HashSet<>(); 
	 
	 hash.add("xyz");     
     hash.add("ABC");
     hash.add("DEF");
     hash.add("POI");
     hash.add(null);
     
     System.out.println("All Object"+hash);
   }
}
