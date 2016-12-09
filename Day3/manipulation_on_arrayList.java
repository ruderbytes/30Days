import java.util.*;
public class Main{
   public static void main(String[] argv){
     ArrayList<Integer> arr  = new ArrayList<>(); 
	 
	 arr.add(5);     
     arr.add(7);
     arr.add(1);
     arr.add(0);
     arr.add(-1);
     
     /*Getting Minimum Element from Array List*/
     int min_Index = arr.indexOf(Collections.min(arr));
     System.out.println("Min Element Index "+min_Index+" Min Element "+arr.get(min_Index));
     
     /*Sort Array List*/
     Collections.sort(arr);
     System.out.println(arr);
     
     
   }
}
