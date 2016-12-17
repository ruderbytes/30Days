interface xMen{
	public void shoot(String x);
}

class WarZone{
	public static void main(String[] args){
		xMen x = null;
		if(args.length > 0){
			//ANON inner class That implements interface 
			x = new xMen(){
				public void shoot(String x){
					for(int i = 0 ;i<x.length();i++){
						System.out.println(x.charAt(i));
					}
				}
			};
		}
		if(x != null){
			x.shoot(args[0]);
		}
	}
}
				



