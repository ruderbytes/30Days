/*Never make a mistake */

class lengthInArray
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  int []a = {1,2,3,4,5,6};
    int i = a.length - 1;
    /* Most Imporatant */
    System.out.println(i);
    System.out.println(a.length);
    while(i>=0){
      System.out.print(a[i]);
      i--;
    } 	
	}
}
