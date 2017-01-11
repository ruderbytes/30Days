//result in nullpointerexception
class runner{
	String checkit(String s){
		//if(s.length() == 0 || s == null){ -> gives nullptr exception
		if(s == null || s.length()==0){
			return "EMPTY";
		}
		else{
			return "Not Empty";
		}
	}
	public static void main(String[] args){
		runner x = new runner();
		System.out.println(x.checkit(null));
	}
}
