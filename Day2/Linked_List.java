/*Linked List can HOLD duplicate
  Internally Uses Doubly linked list
  Faster than Array List(as they use dynamic ARRAY)
*/
import java.util.*;

public class Main{
   public static void main(String[] argv){
     LinkedList<String> stu_info = new LinkedList<>(); 
	 /* Can Include Duplicate */
	 stu_info.add("xyz");     
     stu_info.add("xyz");
     stu_info.add("xyz");
     stu_info.add("xyz");
     
     System.out.println("All Object");
     for ( String v : stu_info) System.out.println(v);
     
   }
}
