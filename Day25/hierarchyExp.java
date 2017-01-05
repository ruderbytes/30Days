// Exception in catch clause must follow a sub to super
// class hierarchy
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
		catch(Exception x){
			System.out.println("Exception class");
		}
		// all exp is handled by Exception class
		// Thus Throwable catch will never execute 
		catch(Throwable x){
			System.out.println("Throwable class");
		}
			
	}

	
   }		
}






































