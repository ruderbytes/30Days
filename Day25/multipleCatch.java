class runner{
	public static void main(String[] args){

	String [] s = {"abc","3",null,"ninja"};
	
	for(int i=0; i<7; i++){
		try{
			int a = s[i].length() + Integer.parseInt(s[i]);
		}
		catch(NullPointerException x){
			System.out.println("Catch Null ptr");
		}
		catch(ArrayIndexOutOfBoundsException x){
			System.out.println("Arr out of Bound");
		}
		catch(NumberFormatException x){
			System.out.println("Number format Exp");
		}
			
	}

	
   }		
}






































