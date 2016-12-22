class Ideone
{
	static int x = 10;
	public static void main (String[] args) throws java.lang.Exception
	{
		/* Here in for loop x is acting as local varaible */
		int x;
		for(x = 0; x<20;x++){
			System.out.println(x);
		}
		System.out.println("*"+x);
		/* Accesing a static variable using Class Name*/
		System.out.println(Ideone.x);
    }
		
}
